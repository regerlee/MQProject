package com.lee.rabbitmq;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RabbitProducer {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void sendDemoQueue() {
        Date date = new Date();
        String dateString = new SimpleDateFormat("YYYY-mm-DD hh:MM:ss SSS").format(date);
        System.out.println("[demoQueue] send msg: " + dateString);
        // 第一个参数为刚刚定义的队列名称
        this.rabbitTemplate.convertAndSend("demoQueue", dateString);
        //this.rabbitTemplate.
    }


    /**
     * 功能描述: 创建消息生产者_发送订单请求
     * 〈〉
     * @Param: []
     * @Return: void
     * @Author: Administrator
     * @Date: 2021/12/8 15:22
     */
    public void sendOrderReq(){

    }

}
