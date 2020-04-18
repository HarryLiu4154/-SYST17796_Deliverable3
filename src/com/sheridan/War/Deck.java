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
 * @author lishengh
 */
public class Deck {
    private ArrayList<Card> mCards = new ArrayList();
     private ArrayList <Card> cards = new ArrayList<Card>(52);
    private ArrayList <Card> shuffled = new ArrayList<Card>(52);
    String suit="";
    String rank ="";
    /**
     * default constructor
     */
    public Deck() {
        
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
     public ArrayList<Card> showCards()
    {
        for (int i = 0; i < 4; i++) {
            
            if(i==0){
                suit= "Clubs";
            }
            else if(i==1){
                suit= "Hearts";
            }
            else if(i==2){
                suit= "Spades";
            }else if (i==3){
                suit = "Diamonds";
            }
            for (int j = 0; j < 13; j++) {
                if(j==1){
                    rank = "rank";
                }
                else if(j==2){
                    rank = "two";
                }
                else if(j==3){
                    rank = "Three";
                }
                else if(j==4){
                    rank = "four";
                }
                else if(j==5){
                    rank = "five";
                }
                else if(j==6){
                    rank = "six";
                }
                else if(j==7){
                    rank = "seven";
                }
                else if(j==8){
                    rank = "eight";
                }
                else if(j==9){
                    rank = "nine";
                }
                else if(j==10){
                    rank = "ten";
                }
                else if(j==11){
                    rank = "Jack";
                }
                else if(j==12){
                    rank = "King";
                }
                else if(j==13){
                    rank = "Queen";
                }
            }
        }
        return cards;
    }
    /**
     * randomly shuffles the deck of cards
     */
    public void shuffle() {
        Collections.shuffle(mCards);
        
        // USE THE BELOW CODE INSTEAD TO TEST THE RANDOM SHUFFLING USING A SEED
        // Collections.shuffle(mCards, new Random(5));
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
