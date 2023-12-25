package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Label welcomeText;
    @FXML
    Game_displayer board_Game;
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void Game_displayer_main(){
        board_Game.change_touch_redarw(1);
    }
}