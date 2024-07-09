package com.swiggy;

import org.junit.Test;

import static org.junit.Assert.*;

/*
 * Unit test for Player Class
 */

public class PlayerTest {

    @Test
    public void testPlayerCreation() {
        Player player = new Player(100, 10, 20);
        assertEquals(100, player.getHealth());
        assertEquals(10, player.getStrength());
        assertEquals(20, player.getAttack());
    }

    @Test
    public void testRollOnAttack() {
        Player player = new Player(50, 5, 10);
        int attackRoll = player.rollOnAttack();
        assertTrue("Dice range should be b/w 1 to 6 on roll", attackRoll >= 1 && attackRoll <= 6);
    }


    @Test
    public void testRollOnDefence() {
        Player player = new Player(100, 10, 5);
        int defenceRoll = player.rollOnDefend();
        assertTrue("Dice range should be b/w 1 to 6 on roll", defenceRoll >= 1 && defenceRoll <= 6);
    }

    @Test
    public void testPlayerIsAlive() {
        Player player = new Player(100, 10, 20);
        assertTrue(player.isAlive());
        player.setHealth(0);
        assertFalse(player.isAlive());
    }
}
