package com.example.messagingapp;

public class Message {

    //Instance Variables

    private String message;
    private String sender;

    //Constructor

    public Message(String message, String sender){
        this.message = message;
        this.sender = sender;
    }

    //Accessor Methods

    public String getMessage(){
        return message;
    }

    public String getSender(){
        return sender;
    }

    //toString for debugging

    public String toString(){
        return "Message: " + message + "\nSender: " + sender;
    }
}
