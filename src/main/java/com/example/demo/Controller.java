package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Label welcomeText;
    @FXML
    Canvas board_Game;
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void start(){
        System.out.println("start");
    }
}