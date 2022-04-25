package com.example.messagingapp;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Main extends Application {

    CheckBox userOneChoice;
    CheckBox userTwoChoice;
    CheckBox userThreeChoice;
    CheckBox userOneMessageChoice;
    CheckBox userTwoMessageChoice;
    CheckBox userThreeMessageChoice;
    Text userOneMessageLabel;
    Text userTwoMessageLabel;
    Text userThreeMessageLabel;
    int messageIndex = 0;

    //Instantiate User Objects

    User DemonSlayer13 = new User("DemonSlayer13", "John", "Bezier");
    User FlowerPower4 = new User("FlowerPower4", "Sky", "Winters");
    User JasonErickson1 = new User("JasonErickson1", "Jason", "Erickson");

    //Instantiate UserInfo Object

    UserInfo userInfo = new UserInfo(DemonSlayer13, FlowerPower4, JasonErickson1);

    //Define Root Nodes and Scenes

    Group homeRoot = new Group();
    Scene homeScene = new Scene(homeRoot, 600, 900, Color.LIGHTCYAN);

    Group accountHomeRoot = new Group();
    Scene accountHomeScene = new Scene(accountHomeRoot, 600, 900, Color.LIGHTCYAN);

    Group messagesRoot = new Group();
    Scene messagesScene = new Scene(messagesRoot, 600, 900, Color.LIGHTCYAN);

    @Override
    public void start(Stage stage){








        //Create Text Objects

        //Header

        Text selectAccountPrompt = new Text(50, 50,"Select an account to log into");
        selectAccountPrompt.setFont(Font.font("Arial", 40));

        //User Prompts

        Text userOneLabel = new Text(50, 300, "DemonSlayer13");
        userOneLabel.setFont(Font.font("Arial", 20));

        Text userTwoLabel = new Text(250, 300, "FlowerPower4");
        userTwoLabel.setFont(Font.font("Arial", 20));

        Text userThreeLabel = new Text(410, 300, "JasonErickson1");
        userThreeLabel.setFont(Font.font("Arial", 20));


        //Error Message when no account is selected

        Text homeNoAccountError = new Text(165, 700, "Please select an account");
        homeNoAccountError.setFont(Font.font("Arial", 24));
        homeNoAccountError.setFill(Color.RED);




        //Create Button Objects


        //Confirm Button

        Button homeConfirmButton = new Button("Confirm");





        //Create CheckBox Objects

        //Which user to sign into

        userOneChoice = new CheckBox();
        userTwoChoice = new CheckBox();
        userThreeChoice = new CheckBox();



        //Move Button Objects

        homeConfirmButton.setLayoutX(275);
        homeConfirmButton.setLayoutY(600);


        //Move CheckBox Objects

        userOneChoice.setLayoutX(110);
        userOneChoice.setLayoutY(325);

        userTwoChoice.setLayoutX(310);
        userTwoChoice.setLayoutY(325);

        userThreeChoice.setLayoutX(485);
        userThreeChoice.setLayoutY(325);

        //Add Nodes to the Home Root

        homeRoot.getChildren().add(selectAccountPrompt);
        homeRoot.getChildren().add(userOneLabel);
        homeRoot.getChildren().add(userTwoLabel);
        homeRoot.getChildren().add(userThreeLabel);
        homeRoot.getChildren().add(userOneChoice);
        homeRoot.getChildren().add(userTwoChoice);
        homeRoot.getChildren().add(userThreeChoice);
        homeRoot.getChildren().add(homeConfirmButton);

















        //Nodes for the Messages Screen


        //Create Text Objects

        Text accountHomeHeader = new Text(50, 50, "");
        accountHomeHeader.setFont(Font.font("Arial", 24));

        //User Prompts

        userOneMessageLabel = new Text(50, 300, "DemonSlayer13");
        userOneMessageLabel.setFont(Font.font("Arial", 20));

        userTwoMessageLabel = new Text(250, 300, "FlowerPower4");
        userTwoMessageLabel.setFont(Font.font("Arial", 20));

        userThreeMessageLabel = new Text(410, 300, "JasonErickson1");
        userThreeMessageLabel.setFont(Font.font("Arial", 20));

        //No User Selected Error

        Text homeAccountNoUserError = new Text(25, 600, "Select a user, and send a message between 1 and 800 characters");
        homeAccountNoUserError.setFont(Font.font("Arial", 18));
        homeAccountNoUserError.setFill(Color.RED);

        //Successful Message Send

        Text messageSent = new Text(150, 600, "Message sent successfully!");
        messageSent.setFont(Font.font("Arial", 24));
        messageSent.setFill(Color.LIMEGREEN);


        //Create Button Objects

        Button viewNewMessages = new Button("View Messages");
        Button sendMessage = new Button("Send");
        Button signOutButton = new Button("Sign out");




        //Create CheckBox Objects

        //Which user to send a message to

        userOneMessageChoice = new CheckBox();
        userTwoMessageChoice = new CheckBox();
        userThreeMessageChoice = new CheckBox();



        //Create TextField Objects

        TextField newMessage = new TextField();

        //Move Button Objects

        viewNewMessages.setLayoutX(250);
        viewNewMessages.setLayoutY(200);

        sendMessage.setLayoutX(500);
        sendMessage.setLayoutY(800);

        signOutButton.setLayoutX(500);
        signOutButton.setLayoutY(30);



        //Move CheckBox Objects

        userOneMessageChoice.setLayoutX(110);
        userOneMessageChoice.setLayoutY(325);

        userTwoMessageChoice.setLayoutX(310);
        userTwoMessageChoice.setLayoutY(325);

        userThreeMessageChoice.setLayoutX(485);
        userThreeMessageChoice.setLayoutY(325);


        //Edit TextField Objects

        newMessage.setLayoutX(50);
        newMessage.setLayoutY(800);
        newMessage.setPrefWidth(400);



        //Add Nodes to Messages Screen

        accountHomeRoot.getChildren().add(accountHomeHeader);
        accountHomeRoot.getChildren().add(viewNewMessages);
        accountHomeRoot.getChildren().add(newMessage);
        accountHomeRoot.getChildren().add(sendMessage);
        accountHomeRoot.getChildren().add(signOutButton);
























        //Nodes for the Messages screen

        //Create Text Objects

        //Message Body

        Text messageText  = new Text(50, 200, "");
        messageText.setWrappingWidth(400);
        messageText.maxHeight(300);
        messageText.setFont(Font.font("Arial", 24));

        //Message Header

        Text messageHeader = new Text(10, 50,"");
        messageHeader.setFont(Font.font("Arial", 30));


        //Create Button Objects

        Button homeButton = new Button("Go home");
        Button nextMessage = new Button("Next");
        Button prevMessage = new Button("Prev");


        //Move Button Objects

        //Button to go back to the Account Home Scene

        homeButton.setLayoutX(260);
        homeButton.setLayoutY(800);

        //Button to show the next message

        nextMessage.setLayoutX(400);
        nextMessage.setLayoutY(800);

        //Button to show the previous message

        prevMessage.setLayoutX(145);
        prevMessage.setLayoutY(800);



        //Add Nodes to the Message Screen Root

        messagesRoot.getChildren().add(messageText);
        messagesRoot.getChildren().add(messageHeader);
        messagesRoot.getChildren().add(homeButton);
        messagesRoot.getChildren().add(nextMessage);
        messagesRoot.getChildren().add(prevMessage);

        //Initialize Stage

        stage.setScene(homeScene);
        stage.setResizable(false);
        stage.show();




        //Event Handlers for CheckBoxes (To make sure that only one can be selected at a time)


        //Home Screen CheckBoxes

        userOneChoice.setOnAction(e ->{
            userTwoChoice.setSelected(false);
            userThreeChoice.setSelected(false);
        });

        userTwoChoice.setOnAction(e ->{
            userOneChoice.setSelected(false);
            userThreeChoice.setSelected(false);
        });

        userThreeChoice.setOnAction(e ->{
            userOneChoice.setSelected(false);
            userTwoChoice.setSelected(false);
        });

        //Account Home Screen CheckBoxes

        userOneMessageChoice.setOnAction(e ->{
            userTwoMessageChoice.setSelected(false);
            userThreeMessageChoice.setSelected(false);
        });

        userTwoMessageChoice.setOnAction(e ->{
            userOneMessageChoice.setSelected(false);
            userThreeMessageChoice.setSelected(false);
        });

        userThreeMessageChoice.setOnAction(e ->{
            userOneMessageChoice.setSelected(false);
            userTwoMessageChoice.setSelected(false);
        });




        //Event Handlers for Buttons

        homeConfirmButton.setOnAction(e ->{

                //Conditions to see which user is logging in

                if(userOneChoice.isSelected()){
                    userInfo.logIn(DemonSlayer13);
                    stage.setScene(accountHomeScene);
                    accountHomeRoot.getChildren().add(userTwoMessageChoice);
                    accountHomeRoot.getChildren().add(userThreeMessageChoice);
                    accountHomeRoot.getChildren().add(userTwoMessageLabel);
                    accountHomeRoot.getChildren().add(userThreeMessageLabel);
                }
                else if(userTwoChoice.isSelected()){
                    userInfo.logIn(FlowerPower4);
                    stage.setScene(accountHomeScene);
                    accountHomeRoot.getChildren().add(userOneMessageChoice);
                    accountHomeRoot.getChildren().add(userThreeMessageChoice);
                    accountHomeRoot.getChildren().add(userOneMessageLabel);
                    accountHomeRoot.getChildren().add(userThreeMessageLabel);
                }
                else if(userThreeChoice.isSelected()){
                    userInfo.logIn(JasonErickson1);
                    stage.setScene(accountHomeScene);
                    accountHomeRoot.getChildren().add(userTwoMessageChoice);
                    accountHomeRoot.getChildren().add(userOneMessageChoice);
                    accountHomeRoot.getChildren().add(userTwoMessageLabel);
                    accountHomeRoot.getChildren().add(userOneMessageLabel);
                }
                else{

                    //Try - Catch to prevent duplication error

                    try{
                        homeRoot.getChildren().add(homeNoAccountError);
                    }
                    catch (Exception j){

                        //Empty Catch Field to prevent duplication error

                    }

                }

                //Try - Catch to prevent null error if no user is logged in

                try{
                    accountHomeHeader.setText("Hi " + userInfo.getName() + ", you have " + userInfo.getMessages() + " new message(s).");
                    homeRoot.getChildren().remove(homeNoAccountError);
                }
                catch (Exception j){

                    //Empty Catch Field

                }
                clearBoxes();

        });

        viewNewMessages.setOnAction(e ->{
            stage.setScene(messagesScene);
            clearBoxes();


            //Condition to see what the header and message body should display

            if(!userInfo.hasMessages()){
                messageHeader.setText("You have no messages");
            }
            else{
                messageHeader.setText("Message sent by: " + userInfo.getMessageSender(messageIndex));
                messageText.setText(userInfo.getMessageContent(messageIndex));
                userInfo.readMessage();
            }


            //Clean Screen

            accountHomeRoot.getChildren().remove(messageSent);
            accountHomeRoot.getChildren().remove(homeAccountNoUserError);

        });

        sendMessage.setOnAction(e ->{
            boolean fail = false;

            //Condition to find who to send the message to

            if(userOneMessageChoice.isSelected() && newMessage.getText().length() > 0 && newMessage.getText().length() <= 800){
                userInfo.sendMessage(DemonSlayer13, newMessage.getText());
            }
            else if(userTwoMessageChoice.isSelected() && newMessage.getText().length() > 0 && newMessage.getText().length() <= 800){
                userInfo.sendMessage(FlowerPower4, newMessage.getText());
            }
            else if(userThreeMessageChoice.isSelected() && newMessage.getText().length() > 0 && newMessage.getText().length() <= 800){
                userInfo.sendMessage(JasonErickson1, newMessage.getText());
            }
            else{

                //Add error prompt if no user is selected

                //Try - Catch to avoid duplication error

                try{
                    accountHomeRoot.getChildren().add(homeAccountNoUserError);
                }
                catch (Exception j){

                    //Empty Catch Field to prevent duplication error

                }

                accountHomeRoot.getChildren().remove(messageSent);
                fail = true;

            }

            //Tell the user their message has been sent

            if(!fail){

                //Try - Catch to prevent duplication error

                try{
                    newMessage.setText("");
                    accountHomeRoot.getChildren().add(messageSent);
                    accountHomeRoot.getChildren().remove(homeAccountNoUserError);
                    clearBoxes();
                }
                catch(Exception j){

                    //Empty Catch Field to prevent duplication error

                }

            }

        });

        //Sign Out Button

        signOutButton.setOnAction(e ->{
            stage.setScene(homeScene);
            userInfo.logOut();
            clearUserBoxesAndLabels();
            clearBoxes();

            //Clear Screen

            accountHomeRoot.getChildren().remove(messageSent);
            accountHomeRoot.getChildren().remove(homeAccountNoUserError);
            newMessage.setText("");
        });

        //Home button (On messages screen)

        homeButton.setOnAction(e ->{
            stage.setScene(accountHomeScene);
            accountHomeHeader.setText("Hi " + userInfo.getName() + ", you have " + userInfo.getMessages() + " new message(s).");
            messageIndex = 0;
        });

        //Next Message Button

        nextMessage.setOnAction(e ->{
            if(userInfo.hasNextMessage(messageIndex + 1)){
                messageIndex++;
                messageText.setText(userInfo.getMessageContent(messageIndex));
                messageHeader.setText("Message sent by: " + userInfo.getMessageSender(messageIndex));
            }
        });

        //Previous Message Button

        prevMessage.setOnAction(e ->{
            if(userInfo.hasLastMessage(messageIndex)){
                messageIndex--;
                messageText.setText(userInfo.getMessageContent(messageIndex));
                messageHeader.setText("Message sent by: " + userInfo.getMessageSender(messageIndex));
            }
        });
    }

    //Method to clear CheckBoxes on the home screen

    public void clearBoxes(){
        userOneChoice.setSelected(false);
        userTwoChoice.setSelected(false);
        userThreeChoice.setSelected(false);
        userOneMessageChoice.setSelected(false);
        userTwoMessageChoice.setSelected(false);
        userThreeMessageChoice.setSelected(false);
    }

    public void clearUserBoxesAndLabels(){
        accountHomeRoot.getChildren().remove(userOneMessageChoice);
        accountHomeRoot.getChildren().remove(userTwoMessageChoice);
        accountHomeRoot.getChildren().remove(userThreeMessageChoice);
        accountHomeRoot.getChildren().remove(userOneMessageLabel);
        accountHomeRoot.getChildren().remove(userTwoMessageLabel);
        accountHomeRoot.getChildren().remove(userThreeMessageLabel);
    }

    //Main Method

    public static void main(String[] args) {
        launch();
    }
}