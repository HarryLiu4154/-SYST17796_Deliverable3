/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sheridan.War;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Asra
 */
public class PlayerTest {

    public PlayerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class Player.
     */
    @Test
    public void testGetNameGood() {
        System.out.println("getName");
        Player instance = new Player("asra");
        String expResult = "asra";
        String result = instance.getName();
        assertEquals(expResult, result);

    }

    
  
    @Test (expected =Exception.class)
    public void testGetNamebad() {
        System.out.println("getName");
        Player instance = new Player(" ");
        String expResult = " ";
        String result = instance.getName();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetNameboundary() {
        System.out.println("getName");
        Player instance = new Player("a");
        String expResult = "a";
        String result = instance.getName();
        assertEquals(expResult, result);

    }

    /**
     * Test of addCardToMain method, of class Player.
     */
    @Test
    public void testAddCardToMain() {
        System.out.println("addCardToMain");
        Card card = new Card(Suits.CLUBS, Ranks.ACE_HIGH);
        Player instance = new Player("asra");
        instance.addCardToMain(card);

    }
    
      public void testAddCardToMainbad() {
        System.out.println("addCardToMain");
        Card card = new Card(Suits.CLUBS, Ranks.ACE_HIGH);
        Player instance = new Player("a");
        instance.addCardToMain(card);

    
}

    public void testAddDeckToCaptured() {
        System.out.println("addDeckToCaptured");
        Deck deck = new Deck();
        Player instance = new Player("asrakhan");
        instance.addDeckToCaptured(deck);
       

    }

    /**
     * Test of drawTopCard method, of class Player.
     */
    @Test (expected =Exception.class)
    public void testDrawTopCard() {
        System.out.println("drawTopCard");
        Player instance = new Player("asra khan");
        Card expResult = new Card(Suits.CLUBS, Ranks.TWO);
        Card result = instance.drawTopCard();
        assertEquals(expResult, result);
        

    }

}
