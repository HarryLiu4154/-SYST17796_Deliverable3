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
 * @author aksal
 */
public class WarGameControllerTest {
    
    public WarGameControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("inside @ before class");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("inside @ after class");
    }
    
    @Before
    public void setUp() {
        System.out.println("inside @ before class");
    }
    
    @After
    public void tearDown() {
        System.out.println("inside @ after class");
    }

    @Test
    public void testStartGameEventsGood() {
        System.out.println("startGameEvents");
        WarGameController instance = new WarGameController("asra ", "aqsa");
        instance.startGameEvents();
      
    }
    @Test(expected=Exception.class)
    public void testStartGameEventsbad() {
        System.out.println("startGameEvents");
        WarGameController instance = new WarGameController(" ", " ");
        instance.startGameEvents();
      
    }
    @Test
    public void testStartGameEventsBoundary() {
        System.out.println("startGameEvents");
        WarGameController instance = new WarGameController("a ", "b ");
        instance.startGameEvents();      
    }

    @Test
    public void testTurnStateEventsGood() {
        System.out.println("turnStateEvents");
        WarGameController instance = new WarGameController("asra","aqsa");
        String expResult = "asra has no more cards!";                          
        String result = instance.turnStateEvents();
        assertEquals(expResult, result);
        
    }
    @Test(expected=Exception.class)
    public void testTurnStateEventsbad() {
        System.out.println("turnStateEvents");
        WarGameController instance = new WarGameController(" " , "a");
        String expResult = "Player name cannot be blank or null.";                          
        String result = instance.turnStateEvents();
        assertEquals(expResult, result);        
    }
//
//    @Test
//    public void testWarStateEvents() {
//        System.out.println("warStateEvents");
//        WarGameController instance = null;
//        String expResult = "";
//        String result = instance.warStateEvents();
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testGetWinnerName() {
//        System.out.println("getWinnerName");
//        String loser = "";
//        WarGameController instance = null;
//        String expResult = "";
//        String result = instance.getWinnerName(loser);
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//    
}
