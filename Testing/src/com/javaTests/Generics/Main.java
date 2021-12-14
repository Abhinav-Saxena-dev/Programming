package com.javaTests.Generics;

class Container<T>{   // we can use any character, conventionally we use only capital letters.
                      // Specifying this generic here means that this class will only work with the type T.
                      // This T can be replaced by integer, float, double or any other class, Even a Student class.
    T value;          // Now whenever we create an object of container, we can specify just what type of value we want.

    public void show(){
        System.out.println(value.getClass().getName());
    }

    public void setValue(T value){
        this.value = value;
    }
    public T getValue(){  // Remember that Generics only supports the classes, not wrapper classes,
        return value;     // such as Integer, Double, and not the int, double..
    }

    // Integer, double, all these classes extend the "Number" class
}

// other ways of writing generics..
// class Container<T extends Number> Now it will only except type as T which extend the class Number.

// <? extends T> the ? type must extend the type T;

// <? super T> Only the parent classes of T will be accepted.
public class Main {
    public static void main(String[] args) {

/* -------------------------------------------------------------------------------------------------------------------
        List values = new ArrayList();  a list without generics does not guarantee type safety as different types can
                                        be added in the same list.
        values.add(2);
        values.add("String");

        List<Integer> values = new List<Integer>() {  This is the use of generics and with this we can only add
                                                        integer values to the List values.

        System.out.println(values);
  ------------------------------------------------------------------------------------------------------------------- */

        Container<Integer> ob = new Container<>();   // Whenever we don't specify a type, it becomes "Raw" Type.
                                                     // Now this ob object will have the Integer replace the T as
                                                     // the data type of the value.
        ob.value = 9;
        ob.show();

    }
}
