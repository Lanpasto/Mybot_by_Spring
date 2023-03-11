package com.bot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.example.bot.service.BotService;
import com.example.bot.service.MessageService;
import com.example.bot.service.UpdateService;
import com.example.bot.service.implementation.BotServiceImpl;
import com.example.bot.service.implementation.MessageServiceImpl;
import com.example.bot.service.implementation.UpdateServiceImpl;

@Configuration
@PropertySource("classpath:application.properties")
public class BotConfig {

    @Value("${telegram.bot.username}")
    private String botUsername;

    @Value("${telegram.bot.token}")
    private String botToken;

    @Bean
    public BotService botService() {
        return new BotServiceImpl(botUsername, botToken);
    }

    @Bean
    public UpdateService updateService() {
        return new UpdateServiceImpl();
    }

    @Bean
    public MessageService messageService() {
        return new MessageServiceImpl();
    }
}
