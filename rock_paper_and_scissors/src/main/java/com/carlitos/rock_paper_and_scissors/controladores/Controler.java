package com.carlitos.rock_paper_and_scissors.controladores;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class Controler implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    //photo of rock
    @FXML ImageView phRock;
    //photo of papaer
    @FXML ImageView phPaper;
    //photo of scissors
    @FXML ImageView phScissors;
    //label who shows the winner
    @FXML Label lbWinner;
    //label who shows your decision
    @FXML Label lbYou;
    //label who say decision of Ai
    @FXML Label lbAI;

    int rock = 1;
    int paper = 2;
    int scissors = 3;
    int bot = 0;

    //Methods

    public void onRockClick(){

        whatChosse(rock,aiBot());
        whoWin(rock,bot);

    }

    public void onPaperClick(){

        whatChosse(paper,aiBot());
        whoWin(paper,bot);

    }

    public void onScissorsClick(){

        whatChosse(scissors,aiBot());
        whoWin(scissors,bot);

    }

    public void whoWin(int num,int ai){
        //case draw
        if (num == ai){
            lbWinner.setText("Draw");
        }
        if (num == 1 && ai == 2){
            lbWinner.setText("You losse");
        }
        if (num == 2 && ai == 1){
            lbWinner.setText("You win");
        }
        if(num == 1 && ai == 3){
            lbWinner.setText("You Win");
        }
        if(num == 3 && ai == 1){
            lbWinner.setText("You win");
        }
        if (num == 2 && ai == 3){
            lbWinner.setText("You losse");
        }
        if (num == 3 && ai == 2){
            lbWinner.setText("You win");
        }
    }

    public int aiBot(){
        Random numRandom = new Random();
        int random = numRandom.nextInt(3) + 1;
        bot = random;
        return random;
    }

    public void whatChosse(int num,int ai){

        if(num == 1){
            lbYou.setText("Rock");
        }
        if(num == 2){
            lbYou.setText("Paper");
        }
        if(num == 3){
            lbYou.setText("Scissors");
        }
        if(ai == 1){
            lbAI.setText("Rock");
        }
        if(ai == 2){
            lbAI.setText("Paper");
        }
        if(ai == 3){
            lbAI.setText("Scissors");
        }


    }

//Finish the program
}