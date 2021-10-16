package com.example.lambdaexpressionscontinued;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Button clickMeButton;

    public void initialize(){
        clickMeButton.setOnAction(actionEvent -> System.out.println("You clicked Me!"));
    }

}