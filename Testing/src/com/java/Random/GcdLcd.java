package com.java.Random;

import java.util.Scanner;

public class GcdLcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int s = n;
        int t = m;
        int remainder = 0;
        while(n%m != 0){
            remainder = n%m;
            n = m;
            m = remainder;
        }
        System.out.println(m);
        int lcd = (t * s)/m;
        System.out.println(lcd);
    }
}
