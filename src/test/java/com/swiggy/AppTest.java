package com.swiggy;


import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for Magical Arena.
 */
public class AppTest {

    @Test
    public void testFight() {
        Player playerA = new Player(50, 5, 10);
        Player playerB = new Player(100, 10, 5);

        MagicalArena arena = new MagicalArena(playerA, playerB);
        arena.startFight();
        assertTrue(!playerA.isAlive() || !playerB.isAlive()); // Either one should die after fight
    }
}
