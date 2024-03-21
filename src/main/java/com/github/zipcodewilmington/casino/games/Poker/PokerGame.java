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
    public static void main(String[] args) {
    }

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
    public String evaluateHand(ArrayList<Card> hand) {
        if (isRoyalFlush(hand))
            return PokerHands.ROYAL_FLUSH.getPokerHandName();
        if (isStraightFlush(hand))
            return PokerHands.STRAIGHT_FLUSH.getPokerHandName();
        if (isFourOfAKind(hand))
            return PokerHands.FOUR_OF_A_KIND.getPokerHandName();
        if (isFullHouse(hand))
            return PokerHands.FULL_HOUSE.getPokerHandName();
        if (isFlush(hand))
            return PokerHands.FLUSH.getPokerHandName();
        if (isStraight(hand))
            return PokerHands.STRAIGHT.getPokerHandName();
        if (isThreeOfAKind(hand))
            return PokerHands.THREE_OF_A_KIND.getPokerHandName();
        if (isTwoPair(hand))
            return PokerHands.TWO_PAIR.getPokerHandName();
        if ((isOnePair(hand)))
            return PokerHands.ONE_PAIR.getPokerHandName();
        return PokerHands.HIGH_CARD.getPokerHandName();
    }
    private boolean isStraight(ArrayList<Card> hand) {
        return true;
    }
    private boolean isThreeOfAKind(ArrayList<Card> hand) {
        Card firstCard = hand.get(0);
        Card secondCard = hand.get(1);
        Card thirdCard = hand.get(2);
        int cardCount1 = 0;
        int cardCount2 = 0;
        int cardCount3 = 0;

        if (firstCard == secondCard){
            cardCount1++;
            cardCount2++;
        }

        if (secondCard == thirdCard){
            cardCount2++;
            cardCount3++;
        }

        if (firstCard == thirdCard){
            cardCount1++;
            cardCount3++;
        }

        for (int i = 3; i < hand.size(); i++) {
            if(hand.get(i).getCardValue() == firstCard.getCardValue()){
                cardCount1++;
                if(cardCount == 2);
                return true;
            }
        }
        return false;
    }
    private boolean isFullHouse(ArrayList<Card> hand) {
        return true;
    }
    private boolean isStraightFlush(ArrayList<Card> hand) {return true;}
    private boolean isRoyalFlush(ArrayList<Card> hand) {  return true;
    }
    private boolean isOnePair(ArrayList<Card> hand) {
        for (int i = 0; i < hand.size() - 1; i++) {
            for (int j = i + 1; j < hand.size(); j++) {
                if (hand.get(i).getCardValue() == hand.get(j).getCardValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isTwoPair(ArrayList<Card> hand) {
        int pairCount = 0;
        for (int i = 0; i < hand.size() - 1; i++) {
            for (int j = i + 1; j < hand.size(); j++) {
                if (hand.get(i).getCardValue() == hand.get(j).getCardValue()) {
                    pairCount++;
                }
            }
        }
        return pairCount == 2;
    }

    private boolean isFlush(ArrayList<Card> hand) {
        Card firstCard = hand.get(0);
        Suit suit = firstCard.getSuit();

        for (int i = 1; i < hand.size(); i++) {
            Card nextCard = hand.get(i);
            Suit cardSuit = nextCard.getSuit();
            if (cardSuit != suit)
                return false;
        }
        return true;
    }

    private boolean isFourOfAKind(ArrayList<Card> hand) {
        Card firstCard = hand.get(0);
        Card secondCard = hand.get(1);
        int firstCardCount = 0;
        int secondCardCount = 0;

        if(firstCard == secondCard){
            firstCardCount++;
            secondCardCount++;
        }

        for (int i = 2; i < hand.size(); i++) {
            if(hand.get(i).getCardValue() == firstCard.getCardValue()) {
                firstCardCount++;
                if (firstCardCount == 3)
                    return true;
            }
            if(hand.get(i).getCardValue() == secondCard.getCardValue()) {
                secondCardCount++;
                if (secondCardCount == 3)
                    return true;
            }
        }
        return false;
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
