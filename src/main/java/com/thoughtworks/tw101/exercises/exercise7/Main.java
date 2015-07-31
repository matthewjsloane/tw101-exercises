package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Scanner;

// Write a program that chooses a random number between 1 and 100. Then asks the user to enter a guess. If they guess
// right then tell them they win, otherwise tell them if they guessed too high or low. Keep asking the user to guess
// until they get the right answer. Use classes to separate the different concerns of this program.

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        NumberGame game = new NumberGame();
        int guess = -1;

        System.out.println("Welcome to the number game! It's so much fun.");

        while (!game.guessIsCorrect(guess)) {
            System.out.println("Please enter a guess between 1-100: ");
            guess = Integer.parseInt(s.nextLine());

            if (game.guessIsCorrect(guess)) {
                System.out.println("Yes, you win! Terrific.");
            }else if (game.guessIsTooHigh(guess)) {
                System.out.println("Nope, too high. Guess again!");
            } else {
                System.out.println("Sorry, too low. Try again!");
            }
        }
    }
}
