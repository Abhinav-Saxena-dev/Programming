package com.java.pepcoding.recursion;

import java.util.Scanner;

public class RaiseToPowerRec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int result = power(x,n);
        System.out.println(result);
    }
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        int xn2 = power(x, n/2);
        int xn = xn2 * xn2;
        if(n%2 == 1){
            xn = xn * x;
        }
        return xn;
    }
}
