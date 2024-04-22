package com.example.ubereats;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class HelloController {
    @FXML
    private Label welcomeText;
    private Parent root;
    private Scene scene;
    private Stage stage = new Stage();

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
//        Stage currentStage = (Stage) signUp.getScene().getWindow();
//        currentStage.close();
//        root = FXMLLoader.load(getClass().getResource("signup.fxml"));
//        stage.setScene(new Scene(root));
//        stage.show();
    }
}