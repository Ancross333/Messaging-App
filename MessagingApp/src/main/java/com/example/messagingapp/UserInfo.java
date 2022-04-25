package com.example.messagingapp;

import java.util.ArrayList;

public class UserInfo {

    private ArrayList<User> users = new ArrayList<>();
    private User currentUser;

    public UserInfo(User u1, User u2, User u3){
        users.add(u1);
        users.add(u2);
        users.add(u3);
    }

    //Method to store the current logged in user

    public void logIn(User user){
        currentUser = user;
    }

    //Method to clear the active user

    public void logOut(){
        currentUser = null;
    }

    //Method to send a given user a message

    public void sendMessage(User targetUser, String message){
        targetUser.sendMessage(message, currentUser.getFirstName() + " " + currentUser.getLastName());
    }

    //Method to update the new messages count

    public void readMessage(){
        currentUser.readMessage();
    }

    //Accessor Method for the current users name

    public String getName(){
        return currentUser.getFirstName();
    }

    //Accessor Method for the current users new messages

    public int getMessages(){
        return currentUser.getNewMessages();
    }

    //Accessor Method to get the current users message

    public String getMessageContent(int index){
        return currentUser.getMessage(index).getMessage();
    }

    //Accessor Method to get the current users message sender

    public String getMessageSender(int index){
        return currentUser.getMessage(index).getSender();
    }

    //Accessor Method to get the current user logged in

    public User getCurrentUser(){
        return currentUser;
    }

    //Method to see if the current user has messages or not

    public boolean hasMessages(){
        return (currentUser.getMessages() != 0);
    }

    //Method to see if there is a 'next message'

    public boolean hasNextMessage(int index){
        return currentUser.hasNextMessage(index);
    }

    public boolean hasLastMessage(int index){
        return currentUser.hasLastMessage(index);
    }


}
