package com.cameron.diceGameVg;

import org.junit.jupiter.api.Test;;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {
    @Test
    void rollDice() {
        Dice dice = new Dice();
        assertEquals(dice.randomNumber,dice.rollDice());

    }


    @Test
    void setWinner() {



    }


}