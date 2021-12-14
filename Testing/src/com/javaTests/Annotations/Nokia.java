package com.javaTests.Annotations;

// Marker Annotation : Annotations without any variables inside it.
// Single Value Annotation : As the name suggests, this type has only one variable.
// Multi value Annotation : An annotation having multiple languages.

import java.lang.annotation.*;

@Inherited // if some other class extends Nokia, then if we want to to inherit the annotation as well, we use Inherited.
@Documented
@Target(ElementType.TYPE) // Without this Null point exception was thrown. Target defined on what level we want to use the annotation.
@Retention(RetentionPolicy.RUNTIME) // Retention specifies till what time we want this annotation. these two are called the meta annotation,
@interface SmartPhone{
    String os() default "Symbian"; // we assign a default value incase the values are not specified when called.
    int version() default 1;
}

@SmartPhone(os = "Android", version = 6) // In case we don't specify the values, the default value will be initiated
public class Nokia {

    String model;
    int size;

    public Nokia(String model, int size){
        this.model = model;
        this.size = size;
    }
}

