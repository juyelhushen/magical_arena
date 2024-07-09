package com.swiggy;

import java.util.Random;

public class Player {
    private int health;
    private int strength;
    private int attack;
    private Random randomNum;

    public Player(int health, int strength, int attack) {
        this.health = health;
        this.strength = strength;
        this.attack = attack;
        this.randomNum = new Random();
    }

    public int getHealth() {
        return health;
    }

    public int attack() {
        return randomNum.nextInt(6) + 1;   //generating random number between 1 and 6 for attack
    }

    public int defend() {
        return randomNum.nextInt(6) + 1;   // generating random number between 1 and 6 for defense
    }

    public int getStrength() {
        return strength;
    }

    public void reduceHealth(int damage) {
        health -= damage;
        if (health < 0) health = 0;        //assigning 0 to health  if health is -ve
    }

    public boolean isAlive() {
        return health > 0;       // checking whether is player alive or not
    }
}
