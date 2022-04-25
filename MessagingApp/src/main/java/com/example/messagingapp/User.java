package com.example.messagingapp;

import java.util.ArrayList;

public class User {

    //Instance Variables

    private int newMessages;
    private ArrayList<Message> messages;
    private String username;
    private String firstName;
    private String lastName;

    //Constructor

    public User(String username, String firstName, String lastName){
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        messages  = new ArrayList<>();
    }

    //Method to accept and add a new message

    public void sendMessage(String message, String sender){
        this.messages.add(new Message(message, sender));
        newMessages++;
    }

    //Method to read a new message

    public void readMessage(){
        newMessages = 0;
    }

    //Accessor Methods

    public String getUsername(){
        return username;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public Message getMessage(int index){
        return messages.get(index);
    }

    public int getNewMessages(){
        return newMessages;
    }

    public int getMessages(){
        return messages.size();
    }

    public boolean hasNextMessage(int index){
        return (index < messages.size());
    }

    public boolean hasLastMessage(int index){
        return index > 0;
    }


}
