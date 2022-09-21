package com.cameron.diceGameVg;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class DiceTests {
    // Test for dice Class
    @Test
    public void Dice() {
        Dice dice = new Dice();
        Assert.assertNotNull(dice);
    }
// Test for array score
    @Test
    public void setWinner(){
    Dice dice = new Dice();
        Assert.assertEquals(dice.score, new ArrayList<>());
    }
// Test for array players
    @Test
    public void printPlayerScores (){
        Players players = new Players();
        Assert.assertEquals(players.playersArray, new ArrayList<>());


    }



}