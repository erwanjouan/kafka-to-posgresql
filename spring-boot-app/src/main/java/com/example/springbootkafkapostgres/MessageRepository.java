package com.example.springbootkafkapostgres;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<MessageLog, Long> {
}
