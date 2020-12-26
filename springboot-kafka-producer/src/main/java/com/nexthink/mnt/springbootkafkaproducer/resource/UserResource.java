package com.nexthink.mnt.springbootkafkaproducer.resource;

import com.nexthink.mnt.springbootkafkaproducer.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class UserResource {

    // @Autowired takes care of the whole configuration
    // THis kafka was not bootstrapped because it is running locally
    @Autowired
    KafkaTemplate<String, User> kafkaTemplate;
    // Name if the kafka topic
    private static final String TOPIC = "kafka_topic";

    // Handle REST GET request
    @GetMapping("/publish/{name}")
    public String kafkaPublishMessage(@PathVariable("message") final String name) {

        // Create a user with whatever name provided in the path
        User user = new User(name, "Mantis", 500000L);
        // Publish to kafka
        kafkaTemplate.send(TOPIC, user);

        return "published successfully";
    }
}
