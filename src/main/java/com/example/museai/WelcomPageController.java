package com.example.museai;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class WelcomPageController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}