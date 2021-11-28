package com.java.CustomAnnotations;

//@interface Marker{} these annotations have no methods. @Override and @Deprecated are marker annotations.

/* --------------------------------------------------------------------------------------------------------- */

/*  @interface SingleValueAnnotations{  // annotaitons have one method are called single value annotations.
    int value();

    int value() default 0; we are providing the default value here.
}*/

// @SingleValueAnnotaions(value=10) -> this is how we apply the single value annotations.

/* ------------------------------------------------------------------------------------------------------------ */

/*
@interface MultiValueAnnotations{
    int value1() default 1;

    String value2() default "";

    String value3() default "xyz";
}*/

// @MultiValueAnnotations(value1 = 10, value2 = "Abhi", value3="Ghazi") -> Apply the multi value annotations.

/* ------------------------------------------------------------------------------------------------------------ */

