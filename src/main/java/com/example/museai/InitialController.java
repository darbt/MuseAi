package com.example.museai;

import io.github.palexdev.materialfx.controls.MFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;

import java.io.IOException;

public class InitialController {

    @FXML
    public MFXButton enterBtn;

    public void handleEnterBtn(ActionEvent event) throws Exception{
        Stage stage;
        Parent root;

        stage = (Stage) enterBtn.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("WelcomPage.fxml"));

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
