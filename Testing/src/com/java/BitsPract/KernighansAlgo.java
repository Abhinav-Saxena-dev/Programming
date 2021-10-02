package com.java.BitsPract;

import java.util.Scanner;

public class KernighansAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rsbm = (n & -n);
        int count = 0;
        while(n > 0){
            rsbm = (n & -n);
            n = n - rsbm;
            count++;
        }
        System.out.println(count);
    }
}
