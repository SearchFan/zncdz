package com.yjdz.zncdz.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yjdz.zncdz.comm.AppConfig;
import com.yjdz.zncdz.comm.HttpComm;
import com.yjdz.zncdz.dao.EquipmentinfoMapper;
import com.yjdz.zncdz.dao.HostinfoMapper;
import com.yjdz.zncdz.dao.UserinfoMapper;
import com.yjdz.zncdz.entity.*;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.encoders.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.Security;
import java.util.*;

@Controller
@RequestMapping(value = "user")
public class UserInfoController {

    @Autowired
    private UserinfoMapper userinfoMapper;
    @Autowired
    private EquipmentinfoMapper equipmentinfoMapper;
    @Autowired
    private HostinfoMapper hostinfoMapper;
    private Logger logger = LoggerFactory.getLogger(UserInfoController.class);

    @PostMapping(value = "regist")
    @ResponseBody
    public Map<String, Object> regist(@RequestBody Map<String, String> param) {
        System.out.println("===============");
        Map<String, Object> call = new HashMap<>();
        String code = param.get("code");
        String iv = param.get("iv");
        String encryptedData = param.get("encryptedData");
        String rawData = param.get("rawData");

        if (code == null || "".equals(code) || iv == null || "".equals(iv)
                || encryptedData == null || "".equals(encryptedData) || rawData == null || "".equals(rawData)) {
            call.put("code", "error");
            call.put("message", "参数错误");
            return call;
        }

        AppConfig appConfig = new AppConfig();
        String url = "https://api.weixin.qq.com/sns/jscode2session?appid=" + appConfig.getAppid() + "&" +
                "secret=" + appConfig.getSecret() + "&js_code=" + code + "&grant_type=authorization_code";
        try {
            JSONObject jsonObject = HttpComm.sendHttpGet(url);
            String openid = jsonObject.getString("openid");
            String session_key = jsonObject.getString("session_key");
            UserinfoExample example = new UserinfoExample();
            example.createCriteria().andOpenidEqualTo(openid);
            List<Userinfo> userinfoList = userinfoMapper.selectByExample(example);
            if (userinfoList.size() == 1) {
                if (userinfoList.get(0).getStatus()) {

                    Userinfo userinfo = new Userinfo();
                    userinfo.setId(userinfoList.get(0).getId());
                    userinfo.setLastlandingtime(new Date());
                    userinfoMapper.updateByPrimaryKeySelective(userinfo);
                    call.put("code", "success");
                    call.put("data", userinfoList.get(0));
                    call.put("status", "1");
                    call.put("message", "登录成功");
                    return call;
                }
                call.put("code", "error");
                call.put("message", "登录失败，此账户冻结，请联系管理员");
                return call;
            }

            String equipmentId = param.get("equipmentId");
            if (equipmentId == null || "".equals(equipmentId)) {
                call.put("code", "error");
                call.put("message", "参数错误");
                return call;
            }
            byte[] dataByte = Base64.decode(encryptedData);
            byte[] keyByte = Base64.decode(session_key);
            System.out.println(session_key);
            byte[] ivByte = Base64.decode(iv);
            try {
                int base = 16;
                if (keyByte.length % base != 0) {
                    int groups = keyByte.length / base + (keyByte.length % base != 0 ? 1 : 0);
                    byte[] temp = new byte[base * groups];
                    Arrays.fill(temp, (byte) 0);
                    System.arraycopy(keyByte, 0, temp, 0, keyByte.length);
                    keyByte = temp;
                }

                Security.addProvider(new BouncyCastleProvider());
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding", "BC");
                SecretKeySpec spec = new SecretKeySpec(keyByte, "AES");
                AlgorithmParameters parameters = AlgorithmParameters.getInstance("AES");
                parameters.init(new IvParameterSpec(ivByte));
                cipher.init(2, spec, parameters);
                byte[] resultByte = cipher.doFinal(dataByte);
                if (null != resultByte && resultByte.length > 0) {

                    String result = new String(resultByte, "UTF-8");
                    System.out.println(result.toString());
                    JSONObject jsonObject1 = JSONObject.parseObject(result);
                    System.out.println(jsonObject1.toJSONString());
                    String phone = jsonObject1.getString("phoneNumber");
                    JSONObject userJsonObject = JSON.parseObject(rawData);

                    Userinfo userinfo = new Userinfo();
                    userinfo.setPhone(phone);
                    userinfo.setGender(Byte.valueOf(userJsonObject.getString("gender")));
                    userinfo.setCity(userJsonObject.getString("city"));
                    userinfo.setProvince(userJsonObject.getString("province"));
                    userinfo.setNickname(userJsonObject.getString("nickName"));
                    userinfo.setCountry(userJsonObject.getString("country"));
                    userinfo.setAvatarurl(userJsonObject.getString("avatarUrl"));

                    EquipmentinfoExample example1 = new EquipmentinfoExample();
                    example1.createCriteria().andEquipidEqualTo(equipmentId);
                    List<Equipmentinfo> equipmentinfoList = equipmentinfoMapper.selectByExample(example1);
                    if (equipmentinfoList.size() == 0) {
                        call.put("code", "error");
                        call.put("message", "参数错误");
                        return call;
                    }

                    Hostinfo hostinfo = hostinfoMapper.selectByPrimaryKey(equipmentinfoList.get(0).getHostid());
                    if (hostinfo == null) {
                        call.put("code", "error");
                        call.put("message", "参数错误");
                        return call;
                    }
                    userinfo.setCellid(hostinfo.getCellid());

                    userinfo.setOpenid(openid);
                    userinfo.setRegistrationtime(new Date());
                    userinfo.setLastlandingtime(new Date());
                    userinfoMapper.insertSelective(userinfo);
                    List<Userinfo> userinfoLists = userinfoMapper.selectByExample(example);

                    call.put("code", "success");
                    call.put("status", "1");
                    call.put("data", userinfoLists.get(0));
                    call.put("message", "注册成功");
                    return call;
                }
            } catch (Exception var13) {
                var13.printStackTrace();
                logger.error("解密错误信息====" + var13.toString());
            }

        } catch (IOException e) {
            logger.error(e.toString() + "==》用户注册http请求 异常");
        } finally {
            try {
                HttpComm.closeConn();
            } catch (IOException e) {
                logger.error(e.toString() + "==》用户注册http关闭异常");
            }
        }
        return call;
    }

    @PostMapping(value = "login")
    @ResponseBody
    public Map<String, Object> login(@RequestBody Map<String, String> param) {
        Map<String, Object> call = new HashMap<>();
        String code = param.get("code");
        int size;
        if(code == null || "".equals(code) ){
            call.put("code", "error");
            call.put("message", "参数错误");
            return call;
        }
        AppConfig appConfig = new AppConfig();
        String url = "https://api.weixin.qq.com/sns/jscode2session?appid=" + appConfig.getAppid() + "&" +
                "secret=" + appConfig.getSecret() + "&js_code=" + code + "&grant_type=authorization_code";
        try {
            JSONObject jsonObject = HttpComm.sendHttpGet(url);
            String openid = jsonObject.getString("openid");

            UserinfoExample userinfoExample = new UserinfoExample();
            userinfoExample.createCriteria().andOpenidEqualTo(openid);

            List<Userinfo> userinfoList = userinfoMapper.selectByExample(userinfoExample);

            size = userinfoList.size();

            if(size>0){
                call.put("status", "1");
            }else{
                call.put("status", "0");
            }

        }catch(IOException e) {
            logger.error(e.toString() + "==》用户注册http请求 异常");
        }

        return null;
    }
}
