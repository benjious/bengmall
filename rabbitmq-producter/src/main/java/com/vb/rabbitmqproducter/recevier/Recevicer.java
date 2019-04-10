package com.vb.rabbitmqproducter.recevier;


import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "hello")
public class Recevicer {
    @RabbitHandler
    public void process(String msg) {
        System.out.println("Receiver: xyz " + msg);

    }

}
