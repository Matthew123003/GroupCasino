package com.github.zipcodewilmington.casino.games.Poker;

import com.github.zipcodewilmington.casino.games.CardClasses.Cards;
import com.github.zipcodewilmington.casino.games.CardClasses.Deck;
import com.github.zipcodewilmington.casino.games.CardClasses.Hand;

import java.util.ArrayList;
import java.util.Comparator;

public class PokerGame extends Cards {

    public static void main(String[] args){}

    // Initialize deck
    // Shuffle the deck
    Deck deck = new Deck();
    deck.shuffleDeck();

    // Deal a card from the deck
    ArrayList<Hand> dealerHand = new ArrayList<>();
    ArrayList<Hand> playerHand = new ArrayList<>();

    // Evaluate hands
    public String evaluateHand(){
            if (isRoyalFlush()) return PokerHands.ROYAL_FLUSH.getPokerHandName();
            if (isStraightFlush()) return PokerHands.STRAIGHT_FLUSH.getPokerHandName();
            if (isFourOfAKind ()) return PokerHands.FOUR_OF_A_KIND.getPokerHandName();
            if (isFullHouse()) return PokerHands.FULL_HOUSE.getPokerHandName();
            if (isFlush()) return PokerHands.FLUSH.getPokerHandName();
            if (isStraight()) return PokerHands.STRAIGHT.getPokerHandName();
            if (isThreeOfAKind()) return PokerHands.THREE_OF_A_KIND.getPokerHandName();
            if (isTwoPair()) return PokerHands.TWO_PAIR.getPokerHandName();
            if ((isOnePair())) return PokerHands.ONE_PAIR.getPokerHandName();
            return PokerHands.HIGH_CARD.getPokerHandName();
    }

    private boolean isThreeOfAKind() {
        playerHand.contains()

    }

    private boolean isOnePair() {
    }

    private boolean isTwoPair() {
    }

    private boolean isStraight() {
    }

    private boolean isFlush() {
    }

    private boolean isFullHouse() {
    }

    private boolean isFourOfAKind() {
    }

    private boolean isStraightFlush() {
    }

    private boolean isRoyalFlush() {
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

public void announceGame(){
            System.out.println("Welcome to Poker FIVE-DRAW PLAY!"+
                    "-->Bid for this game it's fixed at $10\n" +
                    "-->You will get 5 cards.\n" +
                    "-->You can choose to keep them or switch them." +
                    "-->Bet against dealer if you think you have the highest poker hand.\n"+
                    "Let"+"'s" +" play!"
            );
}
}
