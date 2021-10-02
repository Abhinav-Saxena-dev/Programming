package com.java.BitsPract;

import java.util.Scanner;

public class BasicsOfBitMano {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();// set on ith bit
        int j = sc.nextInt();// unset jth bit
        int k = sc.nextInt();// toggle the kth bit
        int m = sc.nextInt();// check mth bit
        int mask1 = (1<<i);
        int mask2 = ~(1<<j);
        int mask3 = (1<<k);
        int mask4 = (1<<m);
        System.out.println("Before set " + n + " After Set " + (n | mask1 ));
        System.out.println("Before unset " + n + " After unSet " + (n & mask2) );
        System.out.println("Before toggle " + n +" After toggle " + (n ^ mask3 ));
        System.out.println("check " + ((n & mask4) == 0 ? "False" : "True" ) );
    }
}
