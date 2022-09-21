package com.cameron.diceGameVg;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class Players {

    // Initialisation
    ArrayList<String> playersArray = new ArrayList<>();
    Menu menu = new Menu();
    Dice dice = new Dice();
    //Variable declaration
    int numberOfPlayers = 0;


    //Method for playersArray
    public void playersArray() {

            printPlayerMessages();



        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.println("Player " + (i + 1) + " name :");
           playersArray.add(menu.userKeyboard.next());
        }
        System.out.println("May the Dice be with you! ");

        for (String s : playersArray) {
            System.out.println("Player " + s);
            System.out.println("------------------------------------------------------");

        }

        dice.newDice();//Call newDice Method

       printPlayers();//Call printPlayers Method

       printPlayerScores();//Call printPlayerScores Method




    }

    //Method for printing userInteraction
    public void printPlayerMessages () {
        boolean done = false;
        while (!done) {
            System.out.println("Enter number of Players: ");
           try {
               numberOfPlayers = menu.userKeyboard.nextInt();
                   done = true;

           }catch (InputMismatchException e) {
               System.out.println("Invalid input please try again.");
               menu.userKeyboard.next();
           }
        }



        //numberOfUsers(numberOfPlayers);

        }








// Method for reading numberOfPlayers
    /*public void numberOfUsers (int numberOfPlayers){
                this.numberOfPlayers = menu.userKeyboard.nextInt();



    }*/


// Method for each player roll
    public void printPlayers(){
        for (String player : playersArray) {
            System.out.println( "\u001B[51m Player " + player + " \u001B[0m" );
            dice.rollDice();

        }

    }

    //Method for printing result of game
    public void printPlayerScores () {

        for (int i = 0; i < playersArray.size(); i++) {
        String a = playersArray.get(i);


//Prints draw message if array size is bigger or equal to 2
    if (dice.setWinner().size() >= 2 && dice.setWinner().contains(i)) {
        System.out.println("\u001B[51m Its a Draw! Player: " + playersArray.get(i) + "             \u001B[0m" );
        System.out.println("1) New Game ");
        System.out.println("0) Exit ");

//Prints winner message if array size is equal to 1
} else if (dice.setWinner().size() == 1 && dice.setWinner().contains(i) ) {

        System.out.println("\u001B[51m Mirror, mirror on the wall who's the luckiest of them all?\n The Winner is player: " + playersArray.get(i) + "                                          \u001B[0m ");

        System.out.println("Play again?");
        System.out.println("1) New Game ");
        System.out.println("0) Exit ");
    }





    }


}
}