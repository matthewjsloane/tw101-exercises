package com.thoughtworks.tw101.exercises.exercise1;

// Exercise #1: Print all odd numbers from 1 to 100 and their sum.

public class Main {
    public static void main(String[] args) {
        int count = 0;
        for (int x = 1; x <= 100; x+=2) {
            System.out.println(x);
            count += x;
        }
        System.out.println(count);
    }
}
