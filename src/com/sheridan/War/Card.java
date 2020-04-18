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
 * @author Harry
 */
public class Card implements Comparable<Card>{
    
    // Variables to represent the values of the card
    private Suits mSuit;
    private Ranks mRank;
    
    /**
     * The suit 
     * @param suit
     * @param rank 
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
     * For a game of war, only the ranks of the cards matter. Therefore the compareTo
     * method only compares cards based on rank
     * @param c the card being compared to
     * @return negative integer if the current instance comes after, positive is 
     * after, and zero if they are the same
     */
    @Override
    public int compareTo(Card c) {
        return this.mRank.compareTo(c.mRank);
    }

    /**
     * equal is strictly consistent with compareTO
     * @param c the card being compared to
     * @return negative integer if the current instance comes after, positive is 
     * after, and zero if they are the same
     */
    @Override
    public boolean equals(Object o) {
        boolean equals = false;
        
        if (o instanceof Card) {
             Card c = (Card)o;
             
             equals = (this.compareTo(c) == 0);
        }
        
        return equals;
    }
    
    /**
     * generates a hashcode for the object
     * @return the hashcode
     */
    @Override        
    public int hashCode() {        
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.mRank);
        return hash;
    }

    @Override
    public String toString() {
        return "Card{" + "mSuit=" + mSuit + ", mRank=" + mRank + '}';
    }
    
}
