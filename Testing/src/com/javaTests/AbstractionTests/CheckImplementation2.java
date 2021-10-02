package com.javaTests.AbstractionTests;

public class CheckImplementation2 extends CheckImplementation {
    public void run(){
        System.out.print("I am implementing the abstract method.");
    }
    public void run2(){
        System.out.println("Hii I am not an abstract method, but I can still be run from the child.");
    }
    public static void main(String[] args) {
        CheckImplementation ob = new CheckImplementation2();
        ob.run();
        /*ob.run2(); Now we can't do this because this will give a compile time error. Since Parent class reference does not have a run2() method. ---------------------------------/-
        */
    }
}
