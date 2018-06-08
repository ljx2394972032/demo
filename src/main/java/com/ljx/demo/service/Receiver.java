package com.ljx.demo.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    @RabbitListener(queues = "hello.queue1")
    public String processMessage1(String msg) {
        System.out.println(Thread.currentThread().getName() + ",processMessage1 接收到来自hello.queue1队列的消息：" + msg);
        return msg.toUpperCase();
    }

    @RabbitListener(queues = "hello.queue2")
    public void processMessage2(String msg) {
        System.out.println(Thread.currentThread().getName() + ",processMessage2 接收到来自hello.queue2队列的消息：" + msg);
    }

    @RabbitListener(queues = "hello.queue2")
    public void processMessage3(String msg) {
        System.out.println(Thread.currentThread().getName() + ",processMessage3 接收到来自hello.queue2队列的消息：" + msg);
    }
}
