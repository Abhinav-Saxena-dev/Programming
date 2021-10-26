package com.java.Threading;

public class App {

    public static void main(String[] args) {
        System.out.println("First job");
        UseThreads task = new UseThreads();
        task.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Printing docs ->");
        }

        System.out.println("Second job");
    }
}
