package com.yjdz.zncdz.comm;

import com.alibaba.fastjson.JSON;
import com.yjdz.zncdz.device.BaseDevice;
import com.yjdz.zncdz.test.TestController;
import org.eclipse.paho.client.mqttv3.IMqttMessageListener;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * mqtt监听的实现类
 */

public class MqttReceiver implements IMqttMessageListener {

    //    @Autowired
    private BaseDevice device = new BaseDevice();
    public static final Logger logger = LoggerFactory.getLogger(MqttReceiver.class);

    @Override
    public void messageArrived(String topic, MqttMessage mqttMessage) {

        System.out.println(mqttMessage);

        try {
            Map<String, String> map = (Map<String, String>) JSON.parse(mqttMessage.toString());

            for (String s : map.keySet()) {
                System.out.println(s + "==" + map.get(s));
            }
            String code = map.get("code");
            switch (code) {
                case "00":
                    device._00(map);
                    break;
                case "01":
                    device._01(map);
                    break;
                case "02":
                    device._02(map);
                    break;
                case "03":
                    device._03(map);
                    break;
                case "04":
                    device._04(map);
                    break;
                case "05":
                    device._05(map);
                    break;
                case "84":
                    device._84(map);
                    break;
                default:
                    logger.error("指令错误==>"+code+",信息==>"+mqttMessage);
            }
        } catch (Exception e) {
            logger.error(e.toString() + "==> 监听参数格式不正确！");
        }
    }
}
