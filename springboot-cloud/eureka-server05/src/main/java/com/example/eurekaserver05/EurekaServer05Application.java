package com.example.eurekaserver05;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer05Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer05Application.class, args);
    }
}
