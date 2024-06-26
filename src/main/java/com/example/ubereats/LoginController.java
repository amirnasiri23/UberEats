package com.example.ubereats;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    @FXML
    private TextField search_text;
    @FXML
    public Button sideBtn;
    private Parent root;
    private Stage stage = new Stage();
    @FXML
    protected void search_function(){
        System.out.println("searched text : " + search_text.getText());
    }
    @FXML
    protected void sideBtnClick() throws IOException {
        root = FXMLLoader.load(getClass().getResource("SideBar.fxml"));
        stage.setScene(new Scene(root));
        stage.show();
    }
}
