package com.thoughtworks.tw101.exercises.exercise9;

import java.util.List;
import java.util.ArrayList;

public class Node {
    private String name;
    private Node left;
    private Node right;

    public Node(String name) {
        this.name = name;
        left = null;
        right = null;
    }

    public void add(String nameOfNewNode) {
        if (name.compareTo(nameOfNewNode) <= 0) {
            if (right != null){
                right.add(nameOfNewNode);
            } else {
                right = new Node(nameOfNewNode);
            }
        } else {
            if (left != null){
                left.add(nameOfNewNode);
            } else {
                left = new Node(nameOfNewNode);
            }
        }
    }

    public List<String> names() {
        List<String> names = new ArrayList<>();
        if (left != null) { names.addAll(left.names()); }
        names.add(name);
        if (right != null) { names.addAll(right.names()); }
        return names;
    }
}
