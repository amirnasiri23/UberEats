package com.example.ubereats;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;
import java.io.IOException;
import javafx.scene.control.TextField;
public class HelloController {
    @FXML
    private ImageView ImageId;
    @FXML
    private Button sideBtn;
    @FXML
    private Label sideError;

    @FXML
    private TextField search_text;
    @FXML
    private Button signUp;
    private Parent root;
    private Scene scene;
    private Stage stage = new Stage();
    @FXML
    protected void search_function(){
        System.out.println("searched text : " + search_text.getText());
    }
    @FXML
    protected void sideClick() {
        sideError.setVisible(true);
    }
    @FXML
    protected void SignUp_Function() throws IOException {
        Stage currentStage = (Stage) signUp.getScene().getWindow();
        currentStage.close();
        root = FXMLLoader.load(getClass().getResource("signup.fxml"));
        stage.setScene(new Scene(root));
        stage.show();
    }
}