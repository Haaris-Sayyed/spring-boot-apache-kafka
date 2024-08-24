package com.example.kafka.consumer;

import com.example.kafka.payload.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "demo", groupId = "myGroup")
    public void consumeMessage(String message){
        log.info(String.format("Consuming the message from demo topic :: %s",message));
    }

    @KafkaListener(topics = "demo-json", groupId = "myGroup")
    public void consumeMessage(Student student){
        log.info(String.format("Consuming the message from demo-json topic :: %s",student.toString()));
    }

}
