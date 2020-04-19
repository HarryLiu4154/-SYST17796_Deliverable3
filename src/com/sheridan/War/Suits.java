/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sheridan.War;

/**
 * enums representing the four suits of standard playing cards
 * @author lishengh
 */
public enum Suits {
    SPADES("Spades"),
    HEARTS("Hearts"),
    CLUBS("Clubs"),
    DIAMONDS("Diamonds");
    
    private String mDisplayName;
    
    private Suits(String displayName) {
        mDisplayName = displayName;
    }
    
    public String getDisplayName() {
        return mDisplayName;
    }
}
