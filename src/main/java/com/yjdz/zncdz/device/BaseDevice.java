package com.yjdz.zncdz.device;

import com.yjdz.zncdz.comm.IotHubClientComm;
import com.yjdz.zncdz.comm.MqttComm;
import com.yjdz.zncdz.comm.GetBeanTool;
import com.yjdz.zncdz.dao.*;
import com.yjdz.zncdz.entity.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class BaseDevice {

    private HostinfoMapper hostinfoMapper = GetBeanTool.getBean(HostinfoMapper.class);
    private EquipmentinfoMapper equipmentinfoMapper = GetBeanTool.getBean(EquipmentinfoMapper.class);
    private CardinfoMapper cardinfoMapper = GetBeanTool.getBean(CardinfoMapper.class);
    private UserinfoMapper userInfoMapper = GetBeanTool.getBean(UserinfoMapper.class);
    private AccountinfoMapper accountinfoMapper = GetBeanTool.getBean(AccountinfoMapper.class);
    //        private ConsumeinfoMapper consumeinfoMapper = getBeanTool.getBean(ConsumeinfoMapper.class);
    public static final Logger logger = LoggerFactory.getLogger(BaseDevice.class);

    public void _84(Map<String, String> map) {

        String imel = map.get("imel");
        if ("".equals(imel) || imel == null) {
            logger.error("84" + "==> 接收的参数异常！");
            return;
        }
        //如果查询不到数据呢？

        String topic = "area/public/" + imel;
        String content = "{84";

        HostinfoExample example = new HostinfoExample();
        example.createCriteria().andImelidEqualTo(imel);
        List<Hostinfo> hostinfoList = hostinfoMapper.selectByExample(example);

        if (hostinfoList.size() > 0) {

            String permissionUuid = hostinfoList.get(0).getPermissionuuid();

            if ("".equals(permissionUuid) || permissionUuid == null) {
                String permissionUUid = IotHubClientComm.createTopic(topic);
                Hostinfo hostinfo = new Hostinfo();
                hostinfo.setId(hostinfoList.get(0).getId());
                hostinfo.setPermissionuuid(permissionUUid);
                hostinfoMapper.updateByPrimaryKeySelective(hostinfo);
            }

            EquipmentinfoExample equipmentinfoExample = new EquipmentinfoExample();
            EquipmentinfoExample.Criteria criteria2 = equipmentinfoExample.createCriteria();
            criteria2.andHostidEqualTo(hostinfoList.get(0).getId());
            criteria2.andPortEqualTo(Byte.valueOf("1"));

            List<Equipmentinfo> equipmentinfoList = equipmentinfoMapper.selectByExample(equipmentinfoExample);

            content += equipmentinfoList.size() + "|";
            for (int i = 0; i < equipmentinfoList.size(); i++) {
                content += equipmentinfoList.get(i).getEquipid() + "|";
            }
            content += "}";

            MqttComm.getPublish(topic, content);
        }
    }

    public void _00(Map<String, String> map) {

        String imel = map.get("imel");
        if ("".equals(imel) || imel == null) {
            logger.error("00" + "==> 接收参数异常！");
            return;
        }
        HostinfoExample example = new HostinfoExample();
        example.createCriteria().andImelidEqualTo(imel);
        Hostinfo hostInfo = new Hostinfo();
        hostInfo.setHeartbeattime(new Date());
        hostinfoMapper.updateByExampleSelective(hostInfo, example);
    }

    public void _01(Map<String, String> map) {

        String equipid = map.get("equipId");
        String portAStr = map.get("portA");
        String portBStr = map.get("portB");
        String pa = map.get("pa");
        String pb = map.get("pb");

        if ("".equals(equipid) || equipid == null || "".equals(portAStr) || portAStr == null ||
                "".equals(portBStr) || portBStr == null
                || "".equals(pa) || pa == null || "".equals(pb) || pb == null) {
            logger.error("01" + "==> 接收参数异常！");
            return;
        }
        try {

            new AdvancedDevice().upEqipmentsByPortOnPower(portAStr, portBStr, pa, pb, equipid);

        } catch (NumberFormatException e) {
            logger.info(e.toString());
            return;
        }
    }

    public void _02(Map<String, String> map) {

        String equipId = map.get("equipId");
        String portAStr = map.get("portA");
        String portBStr = map.get("portB");
        String cardId = map.get("cardId");
        String imel = map.get("imel");

        if ("".equals(equipId) || equipId == null || "".equals(portAStr) || portAStr == null ||
                "".equals(portBStr) || portBStr == null || "".equals(cardId) || cardId == null ||
                "".equals(imel) || imel == null) {
            logger.error("02" + "==> 接收参数异常！");
            return;
        }

        try {
            CardinfoExample example = new CardinfoExample();
            example.createCriteria().andCardidEqualTo(cardId);
            List<Cardinfo> cardinfoList = cardinfoMapper.selectByExample(example);
            String topic = "area/public/" + imel;
            if (cardinfoList.size() > 0) {
                Accountinfo accountinfo = accountinfoMapper.selectByPrimaryKey(cardinfoList.get(0).getAccountid());
                if (accountinfo != null) {

                    Byte portA = Byte.valueOf(portAStr);
                    Byte portB = Byte.valueOf(portBStr);
                    BigDecimal bigDecimal = accountinfo.getAmount();
                    String amount = new DecimalFormat("0").format(bigDecimal.multiply(BigDecimal.valueOf(100)));

                    String content = "{02" + equipId + "|" + accountinfo.getUserid() + "|" + amount + "|" + portAStr + "|" + portBStr + "|}";
                    MqttComm.getPublish(topic, content);

                    if (portA == 4 | portA == 2 && portB == 2 | portB == 4)
                        return;
                    if (bigDecimal.compareTo(BigDecimal.valueOf(1)) == 1) {

                        if (portA == 4 || portA == 2) {

                            String contentA = "{82" + equipId + "|" + accountinfo.getUserid() + "|34|00|1|" +
                                    new SimpleDateFormat("yyyyMMddHHmm").format(new Date()) + "|01|}";
                            MqttComm.getPublish(topic, contentA);
                            return;
                        } else if (portB == 4 || portB == 2) {

                            String contentB = "{82" + equipId + "|" + accountinfo.getUserid() + "|00|34|1|" +
                                    new SimpleDateFormat("yyyyMMddHHmm").format(new Date()) + "|02|}";
                            MqttComm.getPublish(topic, contentB);
                            return;
                        }
                    }
                    return;
                }
            }
            String content = "{02" + equipId + "|0|0|" + portAStr + "|" + portBStr + "|}";
            MqttComm.getPublish(topic, content);

        } catch (NumberFormatException e) {
            logger.error(e.toString() + "==> 02操作转换异常，参数格式不正确！");
            return;
        }
    }

    public void _03(Map<String, String> map) {

        String equipId = map.get("equipId");
        String portAStr = map.get("portA");
        String portBStr = map.get("portB");
        String imel = map.get("imel");
        String userId = map.get("userId");
        String date = map.get("date");
        if ("".equals(equipId) || equipId == null || "".equals(portAStr) || portAStr == null || "".equals(portBStr)
                || portBStr == null || "".equals(imel) || imel == null || "".equals(userId) || userId == null
                | "".equals(date) || date == null) {
            logger.error("03" + "==> 接收参数异常！");
            return;
        }
        String topic = "area/public/" + imel;

        String content = "{03" + equipId + "|}";
        MqttComm.getPublish(topic, content);
        return;
    }

    public void _04(Map<String, String> map) {

        //{'code':'04','imel':'866289030030573','cellId':'1001','hostId':'1','equipId':'12345601','portA':'0',
        // 'portB':'4','date':'201906211127','userId':'1000001','po':'2'}
        String equipId = map.get("equipId");
        String portAStr = map.get("portA");
        String portBStr = map.get("portB");
        String imel = map.get("imel");
        String userId = map.get("userId");
        String cardId = map.get("cardId");

        if ("".equals(equipId) || equipId == null || "".equals(portAStr) || portAStr == null || "".equals(portBStr)
                || portBStr == null || "".equals(imel) || imel == null || "".equals(userId) || userId == null) {
            logger.error("04" + "==> 接收参数异常！");
            return;
        }

        if (true) {
            String topic = "area/public/" + imel;

            String content = "{04" + equipId + "|}";
            MqttComm.getPublish(topic, content);
            return;
        }

        String orderId = new SimpleDateFormat("yyyyMMddHHmmSSsss").format(new Date()) + equipId;
        Orderinfo orderinfo = new Orderinfo();
        orderinfo.setOrderid(orderId);
        if (cardId != null && "".equals(cardId)) {
            orderinfo.setCardid(cardId);
            orderinfo.setChoices("刷卡充电");
        } else {
//            orderinfo.setChargetypename("");
            orderinfo.setChoices("扫码充电");
        }
//        orderinfo.setChargetypeid();
        orderinfo.setUserid(Integer.valueOf(userId));
        orderinfo.setEquipmentid(equipId);
        orderinfo.setStarttime(new Date());
//        orderinfo.setSelectchargingtime();


    }

    public void _05(Map<String, String> map) {

        String equipId = map.get("equipId");
        String portAStr = map.get("portA");
        String portBStr = map.get("portB");
        String imel = map.get("imel");
        String flag = map.get("flag");
        String powerA = map.get("pa");
        String powerB = map.get("pb");

        if ("".equals(equipId) || equipId == null || "".equals(portAStr) || portAStr == null || "".equals(portBStr)
                || portBStr == null || "".equals(imel) || imel == null || "".equals(flag) || flag == null ||
                "".equals(powerA) || powerA == null || "".equals(powerB) || powerB == null) {
            logger.error("05" + "==> 接收参数异常！");
            return;
        }

        String topic = "area/public/" + imel;
        try {
            Byte portA = Byte.valueOf(portAStr);
            Byte portB = Byte.valueOf(portBStr);

            new AdvancedDevice().upEqipmentsByPortOnPower(portAStr, portBStr, powerA, powerB, equipId);

            if (!"FF".equals(flag)) {
                String content = "{05" + equipId + "|}";
                MqttComm.getPublish(topic, content);
                return;
            }

            String content = "{05" + equipId + "|}";
            MqttComm.getPublish(topic, content);
            if (portA == 4) {
                String contentA = "{82" + equipId + "|0|34|00|1|" + new SimpleDateFormat("yyyyMMddHHmm").format(new Date()) + "|01|}";
                MqttComm.getPublish(topic, contentA);
            } else if (portB == 4) {
                String contentB = "{82" + equipId + "|0|00|34|1|" + new SimpleDateFormat("yyyyMMddHHmm").format(new Date()) + "|02|}";
                MqttComm.getPublish(topic, contentB);
            }

        } catch (NumberFormatException e) {
            logger.error(e.toString() + "==> 05操作转换异常，参数格式不正确!");
            return;
        }
    }
}


