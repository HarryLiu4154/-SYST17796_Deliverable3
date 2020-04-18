/*
        Name:  [your name here]
        Assignment:  [assignment name]
        Program: [your program name here]
        Date:  [assignment due date here]
    
        Description:
        [program description in your own words]
    */

package com.sheridan.War;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aksal
 */
public class War {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String player1;
        String player2;
        String option;
        String roundwinner;
        String gamewinner;
        int temp;
        int play =1;
        boolean winner;
        
        while(play !=0){
            winner= false;
            Deck deck = new Deck();
            deck.shuffle(play);
            
            ArrayList<Card> Deck1 = new ArrayList<>();
            ArrayList<Card> Deck2 = new ArrayList<>();
            ArrayList<Card> warDeck = new ArrayList<>();
            
            System.out.println("Welcome to WAR! lets play\n");
            System.out.println("Enter the first player name");
            player1 = input.nextLine();
            System.out.println("Enter second player name");
            player2= input.nextLine();
            
        }
    }

}
