package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(8);
        drawADiamondWithYourName(3);
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {
        if (n <= 0) { return; }

        String blankSpaces = "";
        String horizontalLine = "*";

        for (int x = 1; x < n; x++) {
            blankSpaces += " ";
        }
        System.out.println(blankSpaces + horizontalLine);

        for (int x = n; x > 1; x--) {
            blankSpaces = blankSpaces.substring(0, blankSpaces.length() - 1);
            horizontalLine += "**";
            System.out.println(blankSpaces + horizontalLine);
        }
    }

//    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {
        if (n <= 0) { return; }

        String blankSpaces = "";
        String horizontalLine = "*";

        for (int x = 1; x < n; x++) {
            blankSpaces += " ";
        }
        System.out.println(blankSpaces + horizontalLine);

        for (int x = n; x > 1; x--) {
            blankSpaces = blankSpaces.substring(0, blankSpaces.length() - 1);
            horizontalLine += "**";
            System.out.println(blankSpaces + horizontalLine);
        }

        for (int x = n; x > 1; x--) {
            horizontalLine = horizontalLine.substring(0, horizontalLine.length() - 2);
            blankSpaces += " ";
            System.out.println(blankSpaces + horizontalLine);
        }
    }

//    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *
    private static void drawADiamondWithYourName(int n) {
        if (n <= 0) { return; }

        String blankSpaces = "";
        String horizontalLine = "*";

        for (int x = 1; x < n; x++) {
            blankSpaces += " ";
        }
        System.out.println(blankSpaces + horizontalLine);

        for (int x = n - 1; x > 1; x--) {
            blankSpaces = blankSpaces.substring(0, blankSpaces.length() - 1);
            horizontalLine += "**";
            System.out.println(blankSpaces + horizontalLine);
        }

        // mimic the middle line of the diamond
        blankSpaces = blankSpaces.substring(0, blankSpaces.length() - 1);
        horizontalLine += "**";
        System.out.println(blankSpaces + "Matthew");

        for (int x = n; x > 1; x--) {
            horizontalLine = horizontalLine.substring(0, horizontalLine.length() - 2);
            blankSpaces += " ";
            System.out.println(blankSpaces + horizontalLine);
        }
    }
}
