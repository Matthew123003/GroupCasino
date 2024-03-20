package com.github.zipcodewilmington.casino.games.Poker;

public class PokerGame {

    public static void main(String[] args)

    // Initialize deck
    // Shuffle the deck
    Deck deck = new Deck();
    deck.shuffle();

    // Deal a card from the deck
    Hand dealerHand = new Hand();
    Hand playerHand = new Hand();
        for (int i = 0; i < 5; i++) {
        dealerHand.addCard(deck.dealCard());
        playerHand.addCard(deck.dealCard());
    }

    // Evaluate hands
    // High card
    // One pair
    // Two pair
    // Three-of-a-kind
    // Straight
    // Flush
    // Full house
    // Four-of-a-kind
    // Straight flush
    // Royal Flush

    // Implement hand evaluation logic

    // Determine winner
    // Implement winner determination logic

    // Output winner
    // Output hand rankings
public void announceGame(){
            System.out.println("Welcome to Poker FIVE-DRAW PLAY!\n --> Bid it's fixed at $10\n" );
}
}
