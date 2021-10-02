package com.java.BitsPract;

import java.util.Scanner;

public class JosephusProbAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int lg2 = (int) (Math.log(n) / Math.log(2));
       int l = n - (int)Math.pow(2,lg2);
        System.out.println((2*l)+1);
    }
}
