package com.example.demo;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

import java.util.Random;

public class Game_displayer extends Canvas {
    int [][] game_data = new int[3][3];
    private int singleton =0 ;
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
        if (singleton !=0)
        {
            singleton++;
            return this;
        }
            return new Game_displayer(x);
    }

    public void change_touch_redarw(int x){
//        for start it always gets up
        if (singleton!=0){
            double W = getWidth();
            double H = getHeight();
            double in = W/3;

            GraphicsContext gc = getGraphicsContext2D();
            for (int row = 0 ; row<3; row++)
                for (int col = 0; col <3; col++){
                    if (game_data[row][col]!=0)
                        gc.fillText(String.valueOf(game_data[row][col]), in, in);
                }
        }
    }


}
