package com.java.pepcoding.recursion;

public class FibonnaciRecur {
    public static void main(String... args) {
        long m = Runtime.getRuntime().availableProcessors();
        int n = 5;
        for(int i = 0; i <= n; i++){
            System.out.println(fibon(i)+"   ");
        }
        System.out.println(m);
    }
    public static int fibon(int n){
        if(n <= 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return fibon(n-2)+ fibon(n-1);
    }
}
