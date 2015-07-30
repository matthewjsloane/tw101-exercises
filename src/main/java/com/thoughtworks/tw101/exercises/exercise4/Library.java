package com.thoughtworks.tw101.exercises.exercise4;

import java.io.PrintStream;

public class Library {
    private String[] books;
    private PrintStream printStream;

    public Library(String[] books, PrintStream printStream) {
        this.books = books;
        this.printStream = printStream;
    }

    public String printBooksContaining(String partialBookTitle) {
        String ret = "";
        for (String b: books){
            if (b.contains(partialBookTitle)){
                if (ret.equals("")) {
                    ret += b;
                } else {
                    ret += ", " + b;
                }
            }
        }
        System.out.println(ret);
        return ret;
    }
}
