package com.javaTests.designPatterns.Singleton;

public class SingletonLazy {

    public static SingletonLazy obj;
    int i;

    private SingletonLazy(){
        System.out.println("Instance created");
    }

    public static SingletonLazy getInstance(){
        if(obj == null) {
            obj = new SingletonLazy(); // you can call getInstance() as many times as you want, Instance will only be
        }                              // created once.
        return obj;
    }
}
