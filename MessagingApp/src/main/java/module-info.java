module com.example.messagingapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.messagingapp to javafx.fxml;
    exports com.example.messagingapp;
}