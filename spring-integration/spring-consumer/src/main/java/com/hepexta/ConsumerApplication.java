package com.hepexta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;

@EnableBinding(MessageChannels.class)
@SpringBootApplication
public class ConsumerApplication {

    @Bean
    IntegrationFlow greetingsFlow(MessageChannels channels) {
        return IntegrationFlows.from(channels.input())
                .handle(String.class, (payload, headers) -> {
                    System.out.println(payload);
                    return null;
                })
                .get();
    }

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
