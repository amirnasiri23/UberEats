package com.example.ubereats;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SignUp {

    @FXML
    private TextField emailInput;
    @FXML
    private Label errorText;
    @FXML
    private Button cntBtn;
    private Parent root;
    private Scene scene;
    private Stage stage = new Stage();

    public void getEmail_Function(ActionEvent actionEvent) throws IOException {
        String inputEmail = emailInput.getText();
        if (isEmailValid(inputEmail)) {
            System.out.println("Valid");
            errorText.setVisible(false);
            Login_Function();
        }
        else {
            System.out.println("Invalid");
            errorText.setVisible(true);
        }
    }

    private boolean isEmailValid(String email) {
        String regex = "\\w+@\\w+\\..+[mrg]";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if (matcher.find()) {
            return true;
        }
        else {
            return false;
        }
    }

    private void Login_Function() throws IOException{
        Stage currentStage = (Stage) cntBtn.getScene().getWindow();
        currentStage.close();
        root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        stage.setScene(new Scene(root));
        stage.setTitle(emailInput.getText());
        stage.show();
    }
}
