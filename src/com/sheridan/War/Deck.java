/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sheridan.War;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author
 */
public class Deck {
    private ArrayList<Card> mCards = new ArrayList();
    
    /**
     * default constructor
     */
    public Deck() {
   //   default constructor    
    }
    
    /**
     * makes a deep copy of the input card and adds it to the deck if the deck
     * doesn't already contain it.
     * @param newCard the card being added to the deck
     */
    public void addCard(Card newCard) {
        if (mCards.contains(newCard)) {
            throw new IllegalArgumentException("card already exists within the deck");
        }
        
        mCards.add(new Card(newCard));
    }
    
    /**
     * removes a card from the "top" of the deck (last in the mCards array), and 
     * then returns a copy of the card
     * @return the copy of the top card
     */
    public Card drawTopCard() {
        Card drawnCard = new Card(mCards.get(mCards.size() - 1));
        mCards.remove(mCards.size() - 1);
        
        return drawnCard;
    }
    
    /**
     * randomly shuffles the deck of cards
     */
    public void shuffle() {
        Collections.shuffle(mCards);
        
        
    }
    
    /**
     * returns a boolean for whether or not the deck is currently empty, this is 
     * very important for war
     * @return true if the deck is empty, false otherwise 
     */
    public boolean isEmpty() {
        return mCards.isEmpty();
    }
}
