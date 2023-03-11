package com.bot.service.implementation;

import com.bot.model.Message;
import com.bot.service.MessageService;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.generics.TelegramBot;

@Service
public class MessageServiceImpl implements MessageService {

    private final TelegramBot telegramBot;

    public MessageServiceImpl(TelegramBot telegramBot) {
        this.telegramBot = telegramBot;
    }

    @Override
    public Message sendMessage(Message message) throws TelegramApiException {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(message.getChatId());
        sendMessage.setText(message.getText());

        SendMessage sentMessage = telegramBot.execute(sendMessage);
        return new Message(sentMessage.getChatId(), sentMessage.getText());
    }
}
