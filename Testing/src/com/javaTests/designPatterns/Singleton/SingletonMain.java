package com.javaTests.designPatterns.Singleton;

public class SingletonMain {
    public static void main(String[] args) {
        //      Early instantiation

//        SingletonPattern ob = new SingletonPattern(); we have created an object of singleton pattern,
//        SingletonPattern ob2 = new SingletonPattern(); and here is another object of it.

        // now both of these objects will contain different values of properties.
        // so we use singleton when we want everyone to have only one instance(same value of properties) of a class.

        SingletonEarly ob = SingletonEarly.getInstance(); // everytime we call this we will get the same instance.
        SingletonEarly ob2 = SingletonEarly.getInstance(); // here too, we will get the same instance.

        /* ---------------------------------------------------------------------------------------------------------------- */

        SingletonLazy obL = SingletonLazy.getInstance();
        SingletonLazy obL2 = SingletonLazy.getInstance();
    }
}
