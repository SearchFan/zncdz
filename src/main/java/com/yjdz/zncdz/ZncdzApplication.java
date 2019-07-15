package com.yjdz.zncdz;
import com.yjdz.zncdz.comm.MonitorMqtt;
import com.yjdz.zncdz.comm.MonitorMysqlOrder;
import com.yjdz.zncdz.comm.MqttComm;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;


@SpringBootApplication
@EnableAsync
public class ZncdzApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(ZncdzApplication.class, args);
        MonitorMqtt start1 = context.getBean(MonitorMqtt.class);
        MonitorMysqlOrder start2 = context.getBean(MonitorMysqlOrder.class);
        start1.run();
        start2.run();
    }
}
