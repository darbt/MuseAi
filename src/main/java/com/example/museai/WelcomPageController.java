package com.example.museai;


import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

import io.github.palexdev.materialfx.controls.*;
import javafx.animation.FadeTransition;
import javafx.animation.ParallelTransition;
import javafx.animation.PathTransition;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;


/**
 * FXML Controller class
 *
 * @author AlexH
 */
public class WelcomPageController implements Initializable {

    @FXML //declare Pane for animated menu
    private Pane pane_box;

    @FXML //declare Rectangle for animated menu
    private Rectangle rectangle;

    @FXML //declare Buttons
    private MFXButton button_existing_login, button_new_register,
            button_existingAccount, button_newAccount;

    @FXML //declare ComboBox for user input
    private MFXComboBox<String> comboBox_new_type;

    @FXML //declare DatePicker for user input
    private MFXDatePicker datePicker_new_DOB;

    @FXML //declare TextFields for user input
    private MFXTextField textField_existing_email,
            textField_new_email1, textField_new_email2,
            textField_new_fName, textField_new_lName;

    @FXML //declare PasswordFields for user input
    private MFXPasswordField textField_existing_pass,
            textField_new_pass1, textField_new_pass2;

    @FXML //declare VBoxs for animated menu
    private VBox vBox_existing_fields, vBox_new_fields,
            vBox_existing_box, vBox_new_box;

    /**
     * Initializes the controller class & ComboBox.Account types combo box
     * options must be initialized.
     *
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    public void handleLoginBtn() throws IOException{
        Stage stage;
        Parent root;

        stage = (Stage) button_existing_login.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("Login.fxml"));

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void showExisting() {

        FadeTransition fadeIn_fields = new FadeTransition();
        fadeIn_fields.setDuration(Duration.seconds(1.5));
        fadeIn_fields.setNode(vBox_existing_fields);
        fadeIn_fields.setFromValue(0.0);
        fadeIn_fields.setToValue(1.0);

        FadeTransition fadeIn_box = new FadeTransition();
        fadeIn_box.setDuration(Duration.seconds(1.5));
        fadeIn_box.setNode(vBox_existing_box);
        fadeIn_box.setFromValue(0.0);
        fadeIn_box.setToValue(1.0);

        FadeTransition fadeOut_fields = new FadeTransition();
        fadeOut_fields.setDuration(Duration.seconds(1.5));
        fadeOut_fields.setNode(vBox_new_fields);
        fadeOut_fields.setFromValue(1.0);
        fadeOut_fields.setToValue(0.0);

        FadeTransition fadeOut_box = new FadeTransition();
        fadeOut_box.setDuration(Duration.seconds(1.5));
        fadeOut_box.setNode(vBox_new_box);
        fadeOut_box.setFromValue(1.0);
        fadeOut_box.setToValue(0.0);

        Path leftPath = new Path();
        leftPath.getElements().add(new MoveTo(510, 200));
        leftPath.getElements().add(new LineTo(170, 200));
        PathTransition leftPathTransition = new PathTransition();
        leftPathTransition.setDuration(Duration.seconds(1.25));
        leftPathTransition.setPath(leftPath);
        leftPathTransition.setNode(pane_box);

        ParallelTransition showExisting
                = new ParallelTransition(leftPathTransition,
                fadeIn_fields, fadeIn_box, fadeOut_fields, fadeOut_box);
        vBox_existing_fields.setVisible(true);
        vBox_existing_box.setVisible(true);
        showExisting.play();
        vBox_new_fields.setVisible(false);
        vBox_new_box.setVisible(false);
    }

    public void showNew() {

        FadeTransition fadeIn_fields = new FadeTransition();
        fadeIn_fields.setDuration(Duration.seconds(1.5));
        fadeIn_fields.setNode(vBox_new_fields);
        fadeIn_fields.setFromValue(0.0);
        fadeIn_fields.setToValue(1.0);

        FadeTransition fadeIn_box = new FadeTransition();
        fadeIn_box.setDuration(Duration.seconds(1.5));
        fadeIn_box.setNode(vBox_new_box);
        fadeIn_box.setFromValue(0.0);
        fadeIn_box.setToValue(1.0);

        FadeTransition fadeOut_fields = new FadeTransition();
        fadeOut_fields.setDuration(Duration.seconds(1.5));
        fadeOut_fields.setNode(vBox_existing_fields);

        fadeOut_fields.setFromValue(1.0);
        fadeOut_fields.setToValue(0.0);

        FadeTransition fadeOut_box = new FadeTransition();
        fadeOut_box.setDuration(Duration.seconds(1.5));
        fadeOut_box.setNode(vBox_existing_box);
        fadeOut_box.setFromValue(1.0);
        fadeOut_box.setToValue(0.0);

        Path rightPath = new Path();
        rightPath.getElements().add(new MoveTo(170, 200));
        rightPath.getElements().add(new LineTo(510, 200));
        PathTransition rightPathTransition = new PathTransition();
        rightPathTransition.setDuration(Duration.seconds(1.25));
        rightPathTransition.setPath(rightPath);
        rightPathTransition.setNode(pane_box);

        ParallelTransition showExisting
                = new ParallelTransition(rightPathTransition,
                fadeIn_fields, fadeIn_box, fadeOut_fields, fadeOut_box);

        vBox_new_fields.setVisible(true);
        vBox_new_box.setVisible(true);
        showExisting.play();
        vBox_existing_fields.setVisible(false);
        vBox_existing_box.setVisible(false);

    }

}



