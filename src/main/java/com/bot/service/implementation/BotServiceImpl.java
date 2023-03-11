package com.bot.service.implementation;

import com.bot.controller.BotController;
import com.bot.service.BotService;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Service
public class BotServiceImpl implements BotService {

    private final TelegramBotsApi telegramBotsApi;
    private final BotController botController;

    public BotServiceImpl(TelegramBotsApi telegramBotsApi, BotController botController) {
        this.telegramBotsApi = telegramBotsApi;
        this.botController = botController;
    }

    @Override
    public void init() {
        try {
            telegramBotsApi.registerBot(botController);
        } catch (TelegramApiException e) {
            throw new RuntimeException("Failed to initialize the Telegram bot", e);
        }
    }
}

