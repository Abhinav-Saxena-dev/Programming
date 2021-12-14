package com.javaTests.designPatterns.Singleton;

public class SingletonEarly {

    static SingletonEarly ob = new SingletonEarly(); // eager instantiation.

    private SingletonEarly(){} // we have prevented user from creating an object with the default constructor.

    public static SingletonEarly getInstance(){
        return ob;
    }
}
