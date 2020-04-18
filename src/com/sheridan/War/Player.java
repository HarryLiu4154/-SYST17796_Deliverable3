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
    private Deck mMainDeck = new Deck();
    private Deck mCapturedDeck = new Deck();
    
    /**
     * default public constructor
     */
    public Player() {
        
    }
    
    public void addCardToMain(Card card) {
//        if (mMainDeck.contains(card)) {
//            throw new IllegalArgumentException("card is already in the main deck");
//        }
        
        mMainDeck.addCard(card);
    }
    
    public void addCardToCaptured(Card card) {
//        if (mCapturedDeck.contains(card)) {
//            throw new IllegalArgumentException("card is already in the captured deck");
//        }
        
        mCapturedDeck.addCard(card);
    }
    
    public Card drawTopCard() {
        return mMainDeck.drawTopCard();
    }
    
    public void shuffleCapturedCards() {
        mCapturedDeck.shuffle();
    }
}
