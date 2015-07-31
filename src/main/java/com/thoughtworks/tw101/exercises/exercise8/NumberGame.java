package com.thoughtworks.tw101.exercises.exercise8;

import java.util.Random;
import java.util.ArrayList;

public class NumberGame {

    private int correctAnswer;
    Random r = new Random();
    ArrayList<Integer> guesses;

    public NumberGame(){
        correctAnswer = r.nextInt(100) + 1;
        guesses = new ArrayList<>();
    }

    public boolean guessIsCorrect(int guess){
        if (isValid(guess)) { guesses.add(guess); }
        return (correctAnswer == guess);
    }

    public boolean guessIsTooHigh(int guess){
        return (guess > correctAnswer);
    }

    public ArrayList<Integer> getGuesses() {
        return guesses;
    }

    public boolean isOver(int guess){
        return (correctAnswer == guess);
    }

    private boolean isValid(int guess){
        return (guess >= 1 && guess <= 100);
    }
 }
