package com.nexthink.mnt.springbootkafkaconsumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;

@Service
public class KafkaConsumer {

    // Which topic this consumer will subscribe to
    // print the received message
    @KafkaListener(topics = "kafka_topic", group = "group_id")
    public void consume(String message) {
        System.out.println(
                MessageFormat.format("Received Kafka message is:\n{0}", message)
        );
    }
}
