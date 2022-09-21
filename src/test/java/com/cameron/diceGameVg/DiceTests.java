package com.cameron.diceGameVg;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class DiceTests {
    @Test
    public void Dice() {
        Dice dice = new Dice();
        Assert.assertNotNull(dice);
    }

    @Test
    public void setWinner(){
    Dice dice = new Dice();
        Assert.assertEquals(dice.score, new ArrayList<>());
    }

    @Test
    public void printPlayerScores (){
        Players players = new Players();
        Assert.assertEquals(players.playersArray, new ArrayList<>());


    }



}