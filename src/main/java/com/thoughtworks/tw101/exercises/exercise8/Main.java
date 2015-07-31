package com.thoughtworks.tw101.exercises.exercise8;

import java.util.Scanner;

// Exercise #8: Create a new version of Exercise #7 where you also record all of the user’s guesses and print them out
// once they guess correctly. Use an ArrayList to store the guesses. Catch the NumberFormatException and handle the case
// where the user entered a String that is not parseable.

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        NumberGame game = new NumberGame();
        int guess = -1;

        System.out.println("Welcome to the number game! It's so much fun.");

        while (!game.isOver(guess)) {
            guess = -1;
            System.out.println("Please enter a guess between 1-100: ");

            while (guess == -1) {
                try {
                    guess = Integer.parseInt(s.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a valid, numeric guess.");
                }
            }

            if (game.guessIsCorrect(guess)) {
                System.out.println("Yes, you win! Terrific. Your guesses are below, in order:");
                System.out.println(game.getGuesses().toString());

            }else if (game.guessIsTooHigh(guess)) {
                System.out.println("Nope, too high. Guess again!");
            } else {
                System.out.println("Sorry, too low. Try again!");
            }
        }
    }
}
