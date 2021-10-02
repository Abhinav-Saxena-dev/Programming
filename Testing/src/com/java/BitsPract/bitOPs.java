package com.java.BitsPract;

public class bitOPs {
    public static void main(String[] args) {

        // And ( & ) Operator.   0*1 =0, 1*1 = 1, This is all in Binary numeric system, TRUTH TABLE.
        System.out.println(1 & 0);
        System.out.println(1 & 1);
        System.out.println("BitWise AND of 12 and 10 = " + (12 & 10)); // 12 = 1100 , 10 = 1010 , and 8 = 1000

        // OR ( | ) Operator.   1+0 = 1, 0+0 = 0, 1+1 = 1.
        System.out.println(1 | 0);
        System.out.println(0 | 0);
        System.out.println("BitWise OR of 12 and 10 = " + (12 | 10));  // 14 = 1110

        // NOT ( ~ ) Operator.  ~1 = 0.
        System.out.println("NOT Of "+255+" = " + (~255)); // gives out -256.
        System.out.println("NOT Of "+(-300)+" = " + (~-300)); // gives 299.

        // XOR ( ^ ) Operator. 1^1 = 0. 0^0 = 0. 1^0 = 0^1 = 1.
        System.out.println("BitWise XOR of 12 and 10 = " + (12 ^ 10)); // 6 = 0110

        // LEFT AND RIGHT SHIFT OPERATOR.
        System.out.println("Left SHIFT of 6 with 2, 6<<2 = "+ (6<<2));  // Basically left shift here is number 6 multiplication with 2 to the power of 2.
        System.out.println("Right SHIFT of 24 with 2, 6 >> 2 = "+ (24>>2)); // Basically Right shift here is number 24 divided by 2 to the power of 2.
        System.out.println();
    }
}
