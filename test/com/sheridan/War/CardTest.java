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
public class CardTest {

    public CardTest() {
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
     * Test of getSuit method, of class Card.
     */
    @Test
    public void testGetSuit() {
        System.out.println("getSuit");
        Card instance = new Card(Suits.CLUBS, Ranks.ACE_LOW);
        Suits expResult = Suits.CLUBS;
        Suits result = instance.getSuit();
        assertEquals(expResult, result);

    }

    /**
     * Test of getRank method, of class Card.
     */
    @Test
    public void testGetRank() {
        System.out.println("getRank");
        Card instance = new Card(Suits.CLUBS, Ranks.ACE_LOW);
        Ranks expResult = Ranks.ACE_LOW;
        Ranks result = instance.getRank();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of compareRank method, of class Card.
     */
    @Test
    public void testCompareRank() {
        System.out.println("compareRank");
        Card c = new Card(Suits.CLUBS, Ranks.ACE_LOW);
        Card instance = new Card(Suits.CLUBS, Ranks.ACE_LOW);
        int expResult = 0;
        int result = instance.compareRank(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
/// if ranks are not equal.

    @Test
    public void testCompareRankbad() {
        System.out.println("compareRank");
        Card c = new Card(Suits.CLUBS, Ranks.ACE_LOW);
        Card instance = new Card(Suits.CLUBS, Ranks.ACE_HIGH);
        int expResult = 13;
        int result = instance.compareRank(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    @Test
    public void testCompareRankboundary() {
        System.out.println("compareRank");
        Card c = new Card(Suits.CLUBS, Ranks.ACE_LOW);
        Card instance = new Card(Suits.CLUBS, Ranks.TWO);
        int result = instance.compareRank(c);
        System.out.println(result);
        int expResult = 1;
        assertEquals(expResult, result);

    }

    /**
     * Test of equals method, of class Card.
     */
    @Test
    public void testEqualsNotEqual() {
        System.out.println("equals");
        Object o = null;
        Card instance = new Card(Suits.DIAMONDS, Ranks.FIVE);
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);

    }

    @Test
    public void testEquals() {
        System.out.println("equals");
        Card c = new Card(Suits.DIAMONDS, Ranks.FIVE);
        Card instance = new Card(Suits.DIAMONDS, Ranks.FIVE);
        boolean expResult = true;
        boolean result = instance.equals(c);
        assertEquals(expResult, result);

    }

}
