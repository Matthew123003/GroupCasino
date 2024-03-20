package com.github.zipcodewilmington.casino.games.Poker;

public class PokerGame {

    public static void main(String[] args){}

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
    public String evaluateHand(){
            if (isRoyalFlush()) return PokerHands.ROYAL_FLUSH.getPokerHandName();
            if (isStraightFlush()) return PokerHands.STRAIGHT_FLUSH.getPokerHandName();
            if (isFourOfAKind ()) return PokerHands.FOUR_OF_A_KIND.getPokerHandName();
            if (is)
    }

    public enum PokerHands{
        HIGH_CARD("High Card"),
        ONE_PAIR("One Pair"),
        TWO_PAIR("Two Pair"),
        THREE_OF_A_KIND("Three of a kind"),
        STRAIGHT("Straight"),
        FLUSH("Flush"),
        FULL_HOUSE("Full House"),
        FOUR_OF_A_KIND("Four of a kind"),
        STRAIGHT_FLUSH("Straight Flush"),
        ROYAL_FLUSH("Royal Flush");
        private String pokerHandName;
        PokerHands(String pokerHandName) {
            this.pokerHandName = pokerHandName;
        }
        public String getPokerHandName(){
            return pokerHandName;
        }
    }
    // Implement hand evaluation logic

    // Determine winner
    // Implement winner determination logic

    // Output winner
    // Output hand rankings
public void announceGame(){
            System.out.println("Welcome to Poker FIVE-DRAW PLAY!\n --> Bid it's fixed at $10\n" );
}
}
