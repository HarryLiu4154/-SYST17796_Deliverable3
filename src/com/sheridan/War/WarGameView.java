/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sheridan.War;

import java.util.Scanner;

/**
 *
 * @author Harry
 */
public class WarGameView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to the game of War!");
        System.out.println("Please enter player 1's name: ");
        String name1 = sc.nextLine();
        System.out.println("please enter player 2's name: ");
        String name2 = sc.nextLine();
        
        WarGameController game = null;
        
        try {
            game = new WarGameController(name1, name2);
        }
        catch (IllegalArgumentException ex) {
            System.out.println("Player name cannot be blank.");
            System.exit(0);
        }
        
        WarGameState currentState = WarGameState.START_GAME;
        WarGameState nextState;
        String loser = "";
        
        while (currentState != WarGameState.END_GAME) {
            switch (currentState) {
                case START_GAME: {
                    nextState = WarGameState.TURN_STATE;
                    
                    game.startGameEvents();
                    System.out.println("Thank you. The game will now begin.");
                    
                    currentState = nextState;
                    break;
                }
                case TURN_STATE: {
                    System.out.println("Draw Card? (enter d to offer a draw and end the game, anything else will resume)");
                    
                    if (sc.nextLine().trim().equals("d")) {
                        nextState = WarGameState.END_GAME;
                    }
                    else {
                        String output = game.turnStateEvents();
                        if (output.contains("War will now commence")) {
                            nextState = WarGameState.WAR_STATE;
                        }
                        else if (output.contains("no more cards")) {
                            loser = output.split(" ")[0];
                            nextState = WarGameState.END_GAME;
                        }
                        else {
                            nextState = WarGameState.TURN_STATE;
                        }
                        
                        System.out.println(output);
                    }
                    
                    currentState = nextState;
                    break;
                }
                case WAR_STATE: {
                    String output = game.warStateEvents();
                    
                    if (output.contains("continues")) {
                        nextState = WarGameState.WAR_STATE;
                    }
                    else if (output.contains("no more cards")) {
                        loser = output.split(" ")[0];
                        nextState = WarGameState.END_GAME;
                    }
                    else {
                        nextState = WarGameState.TURN_STATE;
                    }
                    
                    System.out.println(output);
                    
                    currentState = nextState;
                    break;
                }
                default: {
                    System.exit(0);
                }
            }
        }
        
        System.out.println(!loser.isBlank() ? game.getWinnerName(loser) + " has won the war!" : "The war has ended in a draw.");
        System.out.println("Thank you for playing.");
    }
}
