/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sheridan.War;

/**
 * enums denoting the different ranks of a standard playing card, there are 2 aces
 * since aces are considered low or high depending on the game, this allows the code
 * to be more flexible and reusable.
 * 
 * @author lishengh
 */
public enum Ranks {
    ACE_LOW("Ace"),
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    TEN("10"),
    JACK("Jack"),
    QUEEN("Queen"),
    KING("King"),
    ACE_HIGH("Ace");
    
    private String mDisplayName;
    
    private Ranks(String displayName) {
        mDisplayName = displayName;
    }
    
    public String getDisplayName() {
        return mDisplayName;
    }
}
