/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sheridan.War;

/**
 *
 * @author Harry
 */
public class Player {
    private String mName;
    private Deck mMainDeck;
    private Deck mCapturedDeck;
    
    /**
     * default public constructor
     */
    public Player(String name) {
        if (name.isBlank() || name == null) {
            throw new IllegalArgumentException("Player name cannot be blank or null.");
        }
        mName = name;
        mMainDeck = new Deck();
        mCapturedDeck = new Deck();
    }
    
    /**
     * accessor for the name attribute of a player
     * @return the name of the player
     */
    public String getName() {
        return mName;
    }
    
    public void addCardToMain(Card card) {
        if (mMainDeck.contains(card)) {
            throw new IllegalArgumentException("card is already in the main deck");
        }
        
        mMainDeck.addCard(card);
    }
    
    public void addCardToCaptured(Card card) {
        if (mCapturedDeck.contains(card)) {
            throw new IllegalArgumentException("card is already in the captured deck");
        }
        
        mCapturedDeck.addCard(card);
    }
    
    public void addDeckToCaptured(Deck deck) {
        mCapturedDeck.addDeck(deck);
    }
    
    public Card drawTopCard() {
        if (mMainDeck.getDeckSize() < 1 && mCapturedDeck.getDeckSize() < 1) {
            throw new IllegalArgumentException(mName + " has no more cards!");
        }
        else if (mMainDeck.getDeckSize() < 1) {
            mCapturedDeck.shuffle();
            
            mMainDeck.addDeck(mCapturedDeck);
            mCapturedDeck = new Deck();
        }
        
        return mMainDeck.drawTopCard();
    }
}
