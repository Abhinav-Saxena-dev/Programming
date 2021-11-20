package com.java.Random;

public class ConstPract {
    String name;
    final int a;
    int n;

    public ConstPract(String name, int n) {
        this.name = name;
        this.n = n;
        this.a =n;
    }

    public String toString() {
        return "Name" + name + "\n" + "age" + n;
    }
}


