package com.java.Random;

import java.util.TreeMap;

public class ConstPrac2 {
    public static void main(String[] args) {
        ConstPract ob = new ConstPract("Abhi", 5);
        ConstPract ob2 = new ConstPract("sax", 5);
        TreeMap tm = new TreeMap();
        tm.put(ob, "First");
        tm.put(ob2, "Second");
        System.out.println("\n"+tm);
    }
}
