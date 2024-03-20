package com.github.zipcodewilmington.casino.games.Poker;

import com.github.zipcodewilmington.casino.games.CardClasses.Cards;
import com.github.zipcodewilmington.casino.games.CardClasses.Deck;
import com.github.zipcodewilmington.casino.games.CardClasses.Hand;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PokerGame extends Cards {
    //Cards.CardValue card value = deck.pop().getCardValue();
    public static void main(String[] args){}

    // Initialize deck
    // Shuffle the deck
    Deck deck = new Deck();
   // deck.shuffleDeck();


    // Deal a card from the deck
    ArrayList<Cards.Card> dealerHand = new ArrayList<>();
    ArrayList<Cards.Card> playerHand = new ArrayList<>();
    ArrayList<Cards.Suit> playerHandSuit = new ArrayList<>();
    ArrayList<Cards.Suit> dealerHandSuit = new ArrayList<>();



    // Evaluate hands
    public String evaluateHand(){
            if (isRoyalFlush()) return PokerHands.ROYAL_FLUSH.getPokerHandName();
            if (isStraightFlush()) return PokerHands.STRAIGHT_FLUSH.getPokerHandName();
            if (isFourOfAKind ()) return PokerHands.FOUR_OF_A_KIND.getPokerHandName();
            if (isFullHouse()) return PokerHands.FULL_HOUSE.getPokerHandName();
            if (isFlush()) return PokerHands.FLUSH.getPokerHandName();
            if (isStraight()) return PokerHands.STRAIGHT.getPokerHandName();
            if (isThreeOfAKind()) return PokerHands.THREE_OF_A_KIND.getPokerHandName();
//            if (isTwoPair()) return PokerHands.TWO_PAIR.getPokerHandName();
//            if ((isOnePair())) return PokerHands.ONE_PAIR.getPokerHandName();
            return PokerHands.HIGH_CARD.getPokerHandName();
    }

    private boolean isThreeOfAKind() {
        return true;
    }

    private boolean isOnePair(ArrayList<Card> hand) {
        for(int i = 0; i < hand.size() -1; i++){
            for(int j = i + 1; i < hand.size(); j++){
                if(hand.get(i).getCardValue() == hand.get(j).getCardValue()){
                    return true;
                }
            }
        }
        return false;
    }

//    private boolean isTwoPair() {
//        Hand hand = new Hand();
//        int pairCount = 0;
//        for(int i = 0; i < playerHand.size() -1; i++){
//            for(int j = i + 1; i < playerHand.size(); j++){
//                if(hand.get(i).getCardValue() == playerHand.get(j).getCardValue()) || (playerHand.get(i).getSuit() == playerHand.get(j).getSuit());
//                {
//                    pairCount ++;
//                }
//            }
//        }
//        return pairCount >= 2;
//    }

    private boolean isStraight() {
        return true;
    }

    private boolean isFlush() {
        return true;
    }

    private boolean isFullHouse() {
        return true;
    }

    private boolean isFourOfAKind() {
        return true;
    }

    private boolean isStraightFlush() {  return true;
    }

    private boolean isRoyalFlush() {  return true;
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
        private final String pokerHandName;
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
