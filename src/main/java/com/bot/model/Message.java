package com.bot.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.catalina.User;
import org.telegram.telegrambots.meta.api.objects.Chat;

public class Message {
    @JsonProperty("message_id")
    private int messageId;

    @JsonProperty("from")
    private User from;

    @JsonProperty("chat")
    private Chat chat;

    @JsonProperty("date")
    private int date;

    @JsonProperty("text")
    private String text;

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public User getFrom() {
        return from;
    }

    public void setFrom(User from) {
        this.from = from;
    }

    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

