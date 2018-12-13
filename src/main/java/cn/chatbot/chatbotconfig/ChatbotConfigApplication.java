package cn.chatbot.chatbotconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableDiscoveryClient
@SpringBootApplication
@EnableJpaAuditing
public class ChatbotConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChatbotConfigApplication.class, args);
        System.out.println("Config Service Activated.");
    }
}
