package com.example.ubereats;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class SideBarCnt {
    private Parent root;
    public Button signUpBtn;
    private Stage stage = new Stage();
    public void go_to_SignUp_menu() throws IOException {
        Stage currentStage = (Stage) signUpBtn.getScene().getWindow();
        currentStage.close();
        root = FXMLLoader.load(getClass().getResource("signup.fxml"));
        stage.setScene(new Scene(root));
        stage.show();
    }
}
