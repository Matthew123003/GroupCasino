package com.github.zipcodewilmington.casino.games.CardClasses;

import java.util.ArrayList;

public class Dealer extends Cards {


    public void buildDeck(){
        ArrayList<Card> cards = new ArrayList<>();
        for(Suit s : Suit.values()){
            for(CardValue r : CardValue.values()){
                cards.add(new Card(r, s));
            }
        }
    }

}