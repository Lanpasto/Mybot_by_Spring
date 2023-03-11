package com.bot.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.telegram.telegrambots.bots.DefaultBotOptions;
import org.telegram.telegrambots.meta.ApiContext;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import com.example.bot.service.BotService;

@Configuration
public class TelegramBotInitializer {

    @Autowired
    private BotService botService;

    @Bean
    public void initTelegramBot() {
        DefaultBotOptions botOptions = ApiContext.getInstance(DefaultBotOptions.class);
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
        try {
            telegramBotsApi.registerBot(botService.getBotInstance(botOptions));
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
