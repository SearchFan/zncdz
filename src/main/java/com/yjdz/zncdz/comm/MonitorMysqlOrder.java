package com.yjdz.zncdz.comm;

import com.yjdz.zncdz.dao.OrderinfoMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class MonitorMysqlOrder {


    private OrderinfoMapper orderinfoMapper = GetBeanTool.getBean(OrderinfoMapper.class);
    private Logger logger = LoggerFactory.getLogger(MonitorMysqlOrder.class);

    @Async
    public void run(){
        logger.info("===》定时任务修改订单状态启动...");
        while (true){
            try {
                Thread.sleep(60000);
            }catch(InterruptedException e){
                logger.error(e.toString()+"==》订单定时任务异常");
            }
            orderinfoMapper.updateByMonitorOnOrderStatus();
        }
    }

}
