package com.example.demo;

import javafx.scene.canvas.Canvas;

import java.util.Random;

public class Game_displayer extends Canvas {
    int [][] game_data;
    private int singelton =0 ;
    public Game_displayer(int x){
        int[] possibleValues = {2, 4, 8, 16};
        Random rand = new Random();
        int rand_row, rand_col, rand_val;
        for (int i=0 ; i<3; i++){
            rand_row = rand.nextInt(3);
            rand_col = rand.nextInt(3);
            rand_val = rand.nextInt(possibleValues.length);
            game_data[rand_row][rand_col] = rand_val;
        }
    }
    public Game_displayer(int[][] game_data) {
        this.game_data = game_data;
    }

    public Game_displayer(double v, double v1, int[][] game_data) {
        super(v, v1);
        this.game_data = game_data;
    }

    public void setGame_data(int [][] game_data){
        this.game_data = game_data;
    }
    public Game_displayer start(int x){
        if (singelton !=0)
            return this;
        else{

        }
    }

    public void change_touch(){

    }


}
