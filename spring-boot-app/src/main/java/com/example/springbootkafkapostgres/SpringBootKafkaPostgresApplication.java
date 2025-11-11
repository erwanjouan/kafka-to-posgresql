package com.example.springbootkafkapostgres;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootKafkaPostgresApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootKafkaPostgresApplication.class, args);
    }

}
