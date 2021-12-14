package com.javaTests.Annotations;

import java.lang.annotation.Annotation;

public class AnnotationDemo {
    public static void main(String[] args) {

        Nokia obj = new Nokia("Fire", 5);
        Class c = obj.getClass(); // we are using reflection api to fetch the value of the annotation.
                                  // Reflection api is basically a new API using which we can get the values of the
                                  // object or the features of the object.

        Annotation an = c.getAnnotation(SmartPhone.class);
        SmartPhone s = (SmartPhone) an;
        System.out.println(s.os() + " " + s.version());
    }
}
