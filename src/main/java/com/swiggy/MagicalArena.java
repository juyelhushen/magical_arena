package com.swiggy;

public class MagicalArena {
    private final Player playerA;
    private final Player playerB;

    public MagicalArena(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
    }

    void startFight() {
        Player attacker = playerA.getHealth() > playerB.getHealth() ? playerB : playerA;
        Player defender = attacker == playerA ? playerB : playerA;

        while (attacker.isAlive() && defender.isAlive()) {
            int rollOnAttack = attacker.rollOnAttack();
            int rollOnDefense = defender.rollOnDefend();

            int damage = rollOnAttack * attacker.getAttack() - rollOnDefense * defender.getStrength();
            if (damage > 0) defender.reduceHealth(damage); // id damage more than 0, reducing the health by damage

            Player temp = attacker;      // swamping roles for the next round;
            attacker = defender;
            defender = temp;
        }

        if (playerA.isAlive()) System.out.println("Player A wins");
        else System.out.println("Player B wins");
    }
}
