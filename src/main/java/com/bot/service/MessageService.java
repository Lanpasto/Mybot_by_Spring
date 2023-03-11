package com.bot.service;

import com.example.bot.model.Message;

public interface MessageService {
    Message getMessageById(Integer messageId);
    void saveMessage(Message message);
    void deleteMessage(Integer messageId);
}
