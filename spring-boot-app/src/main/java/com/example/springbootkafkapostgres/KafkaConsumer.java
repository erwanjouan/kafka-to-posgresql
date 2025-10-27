package com.example.springbootkafkapostgres;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    private final MessageRepository messageRepository;

    public KafkaConsumer(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @KafkaListener(topics = "topic", groupId = "my-group")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
        messageRepository.save(new Message(message));
    }
}
