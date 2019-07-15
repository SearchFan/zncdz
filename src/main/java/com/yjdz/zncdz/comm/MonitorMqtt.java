package com.yjdz.zncdz.comm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class MonitorMqtt {

    private Logger logger = LoggerFactory.getLogger(MonitorMqtt.class);

    @Async
    public void run(){
            MqttComm.getSubscribe();
            logger.info("======》mqtt监听启动...");
    }
}
