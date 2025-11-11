package com.example.springbootkafkapostgres;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@AllArgsConstructor
@Slf4j
public class KafkaConsumer {

    private final MessageRepository messageRepository;

    @KafkaListener(topics = "new-topic", groupId = "my-group")
    public void consume(Message message) {
        log.info("Consumed message: {}", message);
        messageRepository.save(new MessageLog(null, message, LocalDateTime.now()));
    }
}
