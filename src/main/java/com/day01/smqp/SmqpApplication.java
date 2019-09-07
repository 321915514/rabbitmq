package com.day01.smqp;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableRabbit
@SpringBootApplication
public class SmqpApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmqpApplication.class, args);
    }

}
