package com.thoughtworks.tw101.exercises.exercise6;

public class Troll implements Monster {

    private int hitpoints;
    private static final int INITIAL_HITPOINTS = 40;
    private static final double RESISTANCE = 0.5;
    private static final String NAME = "Troll";

    public Troll() {
        hitpoints = INITIAL_HITPOINTS;
    }

    public void takeDamage(int amount) {
        if (hitpoints - (amount * RESISTANCE) < 0) {
            hitpoints = 0;
        } else {
            hitpoints -= (amount * RESISTANCE);
        }
    }

    public String name () {
        return NAME;
    }

    public int currentHitpoints() {
        return hitpoints;
    }

}
