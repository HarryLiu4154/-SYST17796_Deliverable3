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
public enum Ranks {
    //Initiate Enum constants using the private constructor
    ACE(1, "Ace", "A"),
    TWO(2, "Two", "2"),
    THREE(3, "Three", "3"),
    FOUR(4, "Four", "4"),
    FIVE(5, "Five", "5"),
    SIX(6, "Six", "6"),
    SEVEN(7, "Seven", "7"),
    EIGHT(8, "Eight", "8"),
    NINE(9, "Nine", "9"),
    TEN(10, "Ten", "10"),
    JACK(11, "Jack", "J"),
    QUEEN(12, "Queen", "Q"),
    KING(13, "King", "K");

    // data members for this Enum
    private int num;
    private String longName;
    private String shortName;

    //the constructor of the Enum must be private
    private Ranks(int num, String longName, String shortName) {
        this.num = num;
        this.longName = longName;
        this.shortName = shortName;
    }

    /**
     * Accessor for getting the number of a card. It will be different from
     * ordinal(), because it will start from 1
     *
     * @return the number of a card
     */
    public int getNum() {
        return num;
    }

    /**
     * Accessor for getting the long name of a card
     *
     * @return the long name of a card
     */
    public String getLongName() {
        return longName;
    }

    /**
     * Accessor for getting the short name of a card
     *
     * @return the short name of a card
     */
    public String getShortName() {
        return shortName;
    }
}
