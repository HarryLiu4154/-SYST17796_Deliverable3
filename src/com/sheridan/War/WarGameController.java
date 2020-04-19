/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sheridan.War;

/**
 *
 * @author lishengh
 */
public class WarGameController {
    Deck mCurrentTurnCards;
    Player mPlayerOne;
    Player mPlayerTwo;
    
    public WarGameController(String playerName1, String playerName2) {
        mCurrentTurnCards = new Deck();
        mPlayerOne = new Player(playerName1);
        mPlayerTwo = new Player(playerName2);
    }
    
    /**
     * events for when the game state is START_GAME
     */
    public void startGameEvents() {
        dealCards();
    }
    
    /**
     * generated a standard deck of cards of each suit and rank combination, 
     * shuffles it, and deals it evenly to the two players
     */
    private void dealCards() {
        Deck standardDeck = new Deck();
        for (Suits s : Suits.values()) {
            for (Ranks r : Ranks.values()) {
                if (r != Ranks.ACE_LOW) {
                    standardDeck.addCard(new Card(s, r));
                }
            }
        }
        
        standardDeck.shuffle();
        
        for (int i = 0; i < standardDeck.getDeckSize(); ++i) {
            if (i % 2 == 0) {
                mPlayerOne.addCardToMain(standardDeck.drawTopCard());
            }
            else {
                mPlayerTwo.addCardToMain(standardDeck.drawTopCard());
            }
        }
    }

    public String turnStateEvents() {
        Card c1, c2;
        try {
            c1 = new Card(mPlayerOne.drawTopCard());
            c2 = new Card(mPlayerTwo.drawTopCard());
        }
        catch(IllegalArgumentException ex)
        {
            return ex.getMessage();
        }
        
        String output = "";
        output += mPlayerOne.getName() + " has drawn the " + c1.toString() + "\n";
        output += mPlayerTwo.getName() + " has drawn the " + c2.toString() + "\n";
        
        if (c1.compareRank(c2) < 0) {
            mPlayerOne.addCardToCaptured(c1);
            mPlayerOne.addCardToCaptured(c2);
            output += mPlayerOne.getName() + " wins the round!";
        }
        else if (c1.compareRank(c2) > 0) {
            mPlayerTwo.addCardToCaptured(c1);
            mPlayerTwo.addCardToCaptured(c2);
            output += mPlayerTwo.getName() + " wins the round!";
        }
        else {
            mCurrentTurnCards.addCard(c1);
            mCurrentTurnCards.addCard(c2);
            output += "War will now commence.";
        }
        
        return output;
    }

    /**
     * events for the war, if a player runs out of cards during the war, they lose the game
     * @return 
     */
    public String warStateEvents() {
        String output = "";
        Card c1, c2, faceDown1, faceDown2;
        
        try {
            faceDown1 = new Card(mPlayerOne.drawTopCard());
            c1 = new Card(mPlayerOne.drawTopCard());
            faceDown2 = new Card(mPlayerTwo.drawTopCard());
            c2 = new Card(mPlayerTwo.drawTopCard());
        }
        catch(IllegalArgumentException ex)
        {
            return ex.getMessage();
        }

        output += mPlayerOne.getName() + " places a card face down and also has drawn the " + c1.toString() + "\n";
        output += mPlayerTwo.getName() + " places a card face down and also has drawn the " + c2.toString() + "\n";

        if (c1.compareRank(c2) < 0) {
            this.addCurrentTurnCards(c1, c2, faceDown1, faceDown2);
            mPlayerOne.addDeckToCaptured(mCurrentTurnCards);
            mCurrentTurnCards = new Deck();
            output += mPlayerOne.getName() + " wins the round!";
        }
        else if (c1.compareRank(c2) > 0) {
            this.addCurrentTurnCards(c1, c2, faceDown1, faceDown2);
            mPlayerTwo.addDeckToCaptured(mCurrentTurnCards);
            mCurrentTurnCards = new Deck();
            output += mPlayerTwo.getName() + " wins the round!";
        }
        else {
            this.addCurrentTurnCards(c1, c2, faceDown1, faceDown2);
            output += "The war continues...\n";
        }
        
        return output;
    }
    
    private void addCurrentTurnCards(Card ... cards) {
        for (Card c : cards) {
            mCurrentTurnCards.addCard(c);
        }
    }

    public String getWinnerName(String loser) {
        return (mPlayerOne.getName().contains(loser)) ? mPlayerTwo.getName() : mPlayerOne.getName();
    }
}
