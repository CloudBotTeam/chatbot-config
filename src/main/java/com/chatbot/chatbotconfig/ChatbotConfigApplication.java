package com.chatbot.chatbotconfig;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ChatbotConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChatbotConfigApplication.class, args);
        System.out.println("Config Service Activated.");
    }
}
