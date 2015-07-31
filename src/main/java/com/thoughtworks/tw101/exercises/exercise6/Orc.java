package com.thoughtworks.tw101.exercises.exercise6;

public class Orc implements Monster {

    private int hitpoints;
    private static final int INITIAL_HITPOINTS = 20;
    private static final double RESISTANCE = 1.0;
    private static final String NAME = "Orc";

    public Orc () {
        hitpoints = INITIAL_HITPOINTS;
    }

    public void takeDamage(int amount) {
        if (hitpoints - (amount * RESISTANCE) < 0) {
            hitpoints = 0;
        } else {
            hitpoints -= (amount * RESISTANCE);
        }
    }

    public String name (){
        return NAME;
    }

    public int currentHitpoints() {
        return hitpoints;
    }
}
