package com.github.zipcodewilmington.GameTests.PokerTests;

import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.games.Poker.PokerGame;
import org.junit.Assert;
import org.junit.Test;

public class PokerTest {
    @Test
    public void printRulesTest(){
        PokerGame pokerGame = new PokerGame();
        String expected = "Place rules here";

        String actual = GameInterface.printRules();

        Assert.assertEquals(expected,actual);

    }

    public void addPlayerTest(){
        boolean expected = true;

        boolean actual =
    }
//    + boolean add(PlayerInterface player) return boolean
//+ boolean remove(PlayerInterface player) return boolean
//+ void run()
//+ boolean gameOver() returns boolean;
}
