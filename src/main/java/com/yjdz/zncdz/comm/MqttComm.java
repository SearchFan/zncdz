package com.yjdz.zncdz.comm;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author  zys
 *
 */
public final class MqttComm {

    private static final Logger logger = LoggerFactory.getLogger(MqttComm.class);
    private static final MqttConfig mqttConfig = new MqttConfig();
    public static MqttClient mqttClient = null;

    private MqttComm(){}

    private static MqttClient openMqttConn(){

        MqttConnectOptions mqttConnectOptions = new MqttConnectOptions();
        mqttConnectOptions.setUserName(mqttConfig.getUsername());
        mqttConnectOptions.setPassword(mqttConfig.getPassword().toCharArray());
        try {
            mqttClient = new MqttClient(mqttConfig.getBroker(),mqttConfig.getClientId());
            mqttClient.connect(mqttConnectOptions);
        } catch (MqttException e) {
            logger.error(e.toString());
        }
        return mqttClient;
    }

    public static void getSubscribe(){

        MqttClient mqttClient = openMqttConn();
        try {
            mqttClient.subscribe(mqttConfig.getSubTopic(),new MqttReceiver());
        } catch (MqttException e) {
            logger.error(e.toString()+"==》mqtt监听异常");
        }
    }

    public static void getPublish(String topic, String content){
        MqttClient mqttClient = openMqttConn();
        try {
            MqttMessage message = new MqttMessage(content.getBytes());
            mqttClient.publish(topic,message);
        } catch (MqttException e) {
            logger.error(e.toString());
        }
    }
    public static void closeMqtt(){
        try {
            mqttClient.close();
        } catch (MqttException e) {
            logger.error(e.toString());
        }
    }
}
