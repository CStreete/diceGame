package com.cameron.diceGameVg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Random;

public class Dice {
    // Variable declaration
    public int totalRounds = 0;
    public int numberOfDice = 0;
    public int randomNumber = 0;
    int sum = 0;


    //Initialisation
    Random rand = new Random();
    Menu menu = new Menu();
    ArrayList<Integer> score = new ArrayList<Integer>();

// Method for rolling dice
    public void rollDice () {

        int rollTotal = 0;//Variable declaration
        for (int j = 0; j <totalRounds;  j++) { // Loop for number of rounds
            // Loop for number of dice
            for (int i = 0; i < numberOfDice ; i++) {
                randomNumber = rand.nextInt(6) + 1;
                System.out.println("Rolled: " + randomNumber);
                rollTotal = rollTotal + randomNumber;
            }
            System.out.println("Total Score:" + rollTotal);
            System.out.println("------------------------------------------------------");
        }
        sum = rollTotal;
        score.add(sum);
    }

    // Method for adding to winners array
    public ArrayList<Integer> setWinner (){

        ArrayList<Integer> winnerWinner = new ArrayList<>();
         int winner = Collections.max(score);
        for (int i = 0; i <score.size() ; i++) {
            if (score.get(i).equals(winner)){
                winnerWinner.add(i);
            }
        }return winnerWinner;

    }


// Method for reading dice userInteraction and catching input errors
    public void newDice (){

        boolean done = false;
        while (!done) {
            System.out.println("How many rounds would you like to play: ");
            try {
                totalRounds = menu.userKeyboard.nextInt();
                done = true;
            }catch (InputMismatchException e){
                System.out.println("Invalid input please try again.");
                menu.userKeyboard.next();
            }
        }


        boolean finish = false;
        while (!finish) {
            System.out.println("How many dice would you like to roll: ");
           try {
               numberOfDice = menu.userKeyboard.nextInt();
               finish = true;


        }catch (InputMismatchException e) {
               System.out.println("Invalid input please try again.");
               menu.userKeyboard.next();
           }
    }




}}
