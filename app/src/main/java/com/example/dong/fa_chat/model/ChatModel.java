package com.example.dong.fa_chat.model;

/**
 * Created by DONG on 16-Jul-17.
 */

public class ChatModel {
    public String message;
    public boolean idSend;

    public ChatModel() {
    }

    public ChatModel(String message, boolean idSend) {
        this.message = message;
        this.idSend = idSend;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isIdSend() {
        return idSend;
    }

    public void setIdSend(boolean idSend) {
        this.idSend = idSend;
    }
}
