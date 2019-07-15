package com.yjdz.zncdz.comm;

import java.util.UUID;

public class MqttConfig {

    private String broker;
    private String clientId;
    private String username;
    private String password;
    private String subTopic;



    public String getBroker() {
        return "tcp://gfnz1fy.mqtt.iot.gz.baidubce.com:1883";
    }

    public String getClientId() {
        return "test_mqtt_java_" + UUID.randomUUID().toString();
    }

    public String getUsername() {
        return "gfnz1fy/1jia";
    }

    public String getPassword() {
            return "WoFmBeHT8KIQYnxW";
    }

    public String getSubTopic(){
        return "area/public/pub";
    }
}
