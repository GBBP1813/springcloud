package com.example.consumerfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages= "com.example.consumerfeign")
public class ConsumerFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeignApplication.class, args);
    }
}
