package com.java.CollectionTest;

import java.util.Scanner;
import java.util.TreeSet;

public class treeSet {  //unique elements, maintains ascending order. Can also use descendingIterator with this too.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<String> ts = new TreeSet<String>();
        TreeSet<Integer> ts2 = new TreeSet<Integer>();
        ts.add("Baka");
        ts.add("Anaksanamum");
        ts.add("Asasa");
        ts.add("Hijdadh");
        System.out.println("This is set 1 " + ts);
        ts2.add(3);
        ts2.add(37);
        ts2.add(345);
        ts2.add(12);
        ts2.add(44);
        ts2.add(190);
        System.out.println("This is set 2 " + ts2);           // USING POLL REMOVES THE ELEMENT FROM THE SET.
        System.out.println("This is first value of set 2: " + ts2.pollFirst() + " and the first value of set 1: " + ts.pollFirst()); // Note that treeset maintains ascending order.
        System.out.println("This is last value of set 2: " + ts2.pollLast() + " and the Last value of set 1: " + ts.pollLast());
        System.out.println();
        System.out.println("This is the descending set: " +ts.descendingSet() ); // descendingSet prints reverse of the treeset
        System.out.println("HeadSet: " +ts.headSet("Baka", true)); // Prints elements upto the given element. If inclusive = true, then the element itself is also printed.
        System.out.println("SubSet: " +ts2.subSet(12, true, 190, false)); //It returns a set of elements that lie between the given range.
        System.out.println("TailSet: " +ts2.tailSet(44, true)); // It returns a set of elements that are greater than or equal to the specified element.
    }
}
