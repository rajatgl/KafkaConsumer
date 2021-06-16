package com.org.kafkaconsumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "test",groupId = "group_id")
    public void consume(String message){
        System.out.println("Message: "+message);
    }
}
