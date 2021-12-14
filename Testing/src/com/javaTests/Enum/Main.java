package com.javaTests.Enum;

// every enum in java extends a class called Enum. Enum class provides us with a lot of methods such as ordinal..
// the Enum class extends the object as well.
// Enum class can only implement as interface, and not extend any other class, since it already extends the Enum class.

/*
class test{  This is what's happening behind the working of an enum.

        static final test APPLE = new test();
        static final test SAMSUNG = new test();
        static final test HTC = new test();

        int price;

        public static int getPrice(){
        return price;
        }
}
*/

/*
before ENUM, this is how we used CONSTANTS.
 interface test {
      static String APPLE = "Apple";
      static String SAMSUNG = "Samsung";
 }
 */

import javax.sound.midi.Soundbank;

enum test {
    APPLE(100),  // this basically means -> test APPLE = new test(100);
    SAMSUNG,
    HTC(90);     // and this means -> test HTC = new test(90);

    int price;  // we can create variable inside enum -> java will create a class test and put int price in it.
                // Since there objects will be created, every constant of the enum will have its own price value cause
                // an object.

    test(){         // this will assign 20 to all the constants' price -> Because each time object is created the
        price = 20; // constructor is called.
        System.out.println("Constructor called");
    }

    test(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }
}

public class Main {

    /*  enum test {     // Enum can also be defined inside of a class.
            APPLE,
            SAMSUNG,
            HTC;
    }*/

    public static void main(String[] args) {

//        System.out.println(test.APPLE);

        test en = test.APPLE;

        System.out.println(test.SAMSUNG.ordinal());

        test allVal[] = test.values();  // stores all value of the enum in the array.
                                        // However, values() method is provided by Enum, and as a matter of fact, it is
                                        // not provided by Object class as well, it is provided by the compiler(JVM)

        for(test i : allVal) System.out.println(i);

        switch(en) { // using ENUM in switch, however the constants that are being used in switch should be present in
            case APPLE:  // present in the ENUM class.
                System.out.println("Apple here " + en.price);
                break;
            case SAMSUNG:
                System.out.println("Samsung here " + en.price);
                break;
            default:
                System.out.println("Hush " + en.price);
        }
    }
}
