/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sheridan.War;

import java.util.Objects;

/**
 * This is a class that represents a card based on its suit and rank.
 * 
 * @author lishengh
 */
public class Card {
    
    // Variables to represent the values of the card
    private Suits mSuit;
    private Ranks mRank;
    
    /**
     * Constructor for Card that takes in a suit and a rank
     * @param suit the suit
     * @param rank the rank
     */
    public Card(Suits suit, Ranks rank) {
        mSuit = suit;
        mRank = rank;
    }
    
    /**
     * Constructor to make a deep copy of the input Card
     * @param newCard the input Card
     */
    public Card(Card newCard) {
        this.mSuit = newCard.mSuit;
        this.mRank = newCard.mRank;
    }
    
    public Suits getSuit() {
        return mSuit;
    }
    
    public Ranks getRank() {
        return mRank;
    }
    
    /**
     * Method to compare the ranks of the current instance of the class and another
     * card
     * @param c the card being compared to
     * @return a negative number if the rank of this card is lower
     */
    public int compareRank(Card c) {
        return this.mRank.compareTo(c.mRank);
    }

    /**
     * compareTo from the Comparable interface is not implemented because it must
     * be strictly consistent with equals, instead it is replaced with compareRank, 
     * and another moethod compareSuit may be created should the Card class be reused
     * for another card game.
     * 
     * @param o the object being compared to
     * @return negative integer if the current instance comes after, positive is 
     * after, and zero if they are the same
     */
    @Override
    public boolean equals(Object o) {
        boolean equals = false;
        
        if (o instanceof Card) {
             Card c = (Card)o;
             
             equals = ((this.mSuit == c.mSuit) && (this.mRank == c.mRank));
        }
        
        return equals;
    }
    
    /**
     * generates a hashcode for the object
     * @return the hashcode
     */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.mSuit);
        hash = 97 * hash + Objects.hashCode(this.mRank);
        return hash;
    }
    
    /**
     * returns a string representing the card ca
     * @return 
     */
    @Override
    public String toString(){
        return mRank.getDisplayName() + " of " + mSuit.getDisplayName();
    }
}
