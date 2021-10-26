package com.java.CodeChef;

import java.util.Scanner;

public class ThreeBox {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a, b, c, d, dif, left, rem;
        while (t > 0) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            d = sc.nextInt();
            dif = d - (a + b + c);
            if (dif >= 0) {
                System.out.println(1);
            } else{
                left = (a+b+c)/d;
                rem = (a+b+c)%d;
                System.out.println(rem == 0 ? left : left + 1);
                }
            }
        }
    }

