package com.thoughtworks.tw101.exercises.exercise3;

public class OddSum {

    public int of(int start, int end) {
        int count = 0;
        // switch start and end if start > end
        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }
        // make sure start is an odd number
        if (start % 2 == 0) { start++; }
        for (int x = start; x <= end; x+=2) {
            count += x;
        }
        return count;
    }
}
