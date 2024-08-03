package com.swiggy;

/**
 * Magical arena main class!
 */
public class App {
    public static void main(String[] args) {
        Player playerA = new Player(50, 5, 10);
        Player playerB = new Player(100, 10, 5);

        MagicalArena arena = new MagicalArena(playerA, playerB);
        int r = 0;
        while(r < 10) {
            arena.startFight();  // calling startFight() from the arena
            r++;
        }
    }
}
