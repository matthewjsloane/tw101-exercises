package com.thoughtworks.tw101.exercises.exercise6;

import java.util.ArrayList;

// Exercise #6: Create Orc and Troll classes that implement a Monster interface with takeDamage(int amount),
// reportStatus methods (NOTE: the instructions online say takeDamage, name, and currentHitpoints method, so I'll follow that.
// Create instances of both classes and store them in an ArrayList.
// Iterate through the list and make each monster take 10 points of damage. After you have damaged all of the monsters,
// report the status of all monsters using a void reportStatus() method. ReportStatus should print the name and current hit 
// points of the monster.
// * Orcs are named “Orc” and have 20 initial hitpoints
// * Trolls are named “Troll”, have 40 hit points and only take half damage

public class Main {

    private static final int DAMAGE_AMOUNT = 10;

    public static void main(String[] args) {

        Orc dmitri = new Orc();
        Orc sungyoung = new Orc();
        Orc lyla = new Orc();
        Troll janine = new Troll();
        Troll zoe = new Troll();

        ArrayList<Monster> monsters = new ArrayList<>();

        monsters.add(dmitri);
        monsters.add(sungyoung);
        monsters.add(lyla);
        monsters.add(janine);
        monsters.add(zoe);

        for (Monster m: monsters) {
            m.takeDamage(DAMAGE_AMOUNT);
        }

        for (Monster m: monsters) {
            System.out.println("Name: " + m.name() + ", Hitpoints: " + m.currentHitpoints());
        }
    }
}
