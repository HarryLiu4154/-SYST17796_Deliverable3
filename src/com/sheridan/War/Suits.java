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
public enum Suits {

    //Initiate Enum constants using the private constructor
    CLUBS(1, "Clubs", '\u2663'),
    DIAMONDS(2, "Diamonds", '\u2666'),
    HEARTS(3, "Hearts", '\u2665'),
    SPADES(4, "Spades", '\u2660');

    // data members for this Enum
    private int number;
    private String face;
    private char symbol;

    //the constructor of the Enum must be private
    private Suits(int number, String face, char symbol) {
        this.number = number;
        this.face = face;
        this.symbol = symbol;
    }

    /**
     * Accessor for getting the number of a suit. It will be different from
     * ordinal(), because it will start from 1
     *
     * @return the number of a card suit
     */
    public int getNumber() {
        return number;
    }

    /**
     * Accessor for getting the long of a card suit
     *
     * @return the suitName of a card suit
     */
    public String getFace() {
        return face;
    }

    /**
     * Accessor for getting the symbol of a card suit
     *
     * @return the symbol of a card suit
     */
    public char getSymbol() {
        return symbol;
    }
}
