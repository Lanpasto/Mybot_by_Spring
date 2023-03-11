package com.bot.model;


public class Update {
    private Integer updateId;
    private Message message;
    // можуть бути й інші поля, залежно від того, які дані потрібні вашому боту

    public Integer getUpdateId() {
        return updateId;
    }

    public void setUpdateId(Integer updateId) {
        this.updateId = updateId;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }
}
