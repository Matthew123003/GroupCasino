package com.github.zipcodewilmington.GameTests.DealerTests;

import com.github.zipcodewilmington.casino.games.CardClasses.Cards;
import com.github.zipcodewilmington.casino.games.CardClasses.Dealer;
import com.github.zipcodewilmington.casino.games.CardClasses.Deck;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.Stack;

public class DealerTest {
    @Test
    public void shuffleDeckTest{
        //shuffleDeck(Deck deck)
        Dealer dealer = new Dealer();
        Deck deck = new Deck();

        Stack<Cards> expected = deck;

        Stack<Cards> actualDeck = dealer.shuffleDeck(Deck);
        Assert.assertNotEquals(expected, actualDeck);
    }
    @Test
    public void dealTest{
        //deal() returns ArrayList<Hand>
        Dealer dealer = new Dealer();
        Deck deck = new Deck();
        //expected =

        // actual =

        Assert.assertEquals();
    }
    @Test
    public void takeTurnTest{}//boolean takeTurn() return boolean
    @Test
    public void hitTest{}//hit() returns Card
    @Test
    public void getHandTest{}//ArrayList<Cards> getHand() returns hand
    @Test
    public void compareCardsTest{}//Card compareCards() returns winner

}
