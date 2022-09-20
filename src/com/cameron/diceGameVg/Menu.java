package com.cameron.diceGameVg;
import java.util.*;

public class Menu {
    Scanner userKeyboard = new Scanner(System.in); // Scanner Import
     // Instantiation



    boolean exit; // Loop Variable


// Program Start
    public void runMenu (){

        printMenu();
while (!exit) {
    menuSelections();
}
    }

// Program Menu
    public void printMenu(){

        System.out.println("\u001B[51m Welcome to Dice Game!\n By Cameron Streete :D   \u001B[0m");
        System.out.println("1) New Game ");
        System.out.println("0) Exit ");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Enter your choice: ");

    }
// Program Menu Selections
    public void menuSelections (){
        //Initialisation
       Players players = new Players();

        String choice = userKeyboard.next();

        switch (choice) {
            case "1":
                players.playersArray();

                break;


            case "0":
                System.out.println("Thank you for playing Camerons Dice Game  ");
                System.exit(0);
                break;

        default:  System.out.println("Invalid Selection");
        }


    }


}














