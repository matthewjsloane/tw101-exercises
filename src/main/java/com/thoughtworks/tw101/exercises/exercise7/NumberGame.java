package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Random;

public class NumberGame {

    private int correctAnswer;
    Random r = new Random();

    public NumberGame(){
        correctAnswer = r.nextInt(100) + 1;
    }

    public boolean guessIsCorrect(int guess){
        return (correctAnswer == guess);
    }

    public boolean guessIsTooHigh(int guess){
        return (guess > correctAnswer);
    }
}
