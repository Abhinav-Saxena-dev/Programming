package com.java.pepcoding.dp;

import java.util.Scanner;

public class BinaryStringsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dp0[] = new int[n+1];
        int dp1[] = new int[n+1];
        dp1[1] = dp0[1] = 1;
        for(int i = 2; i <= n; i++){
            dp1[i] = dp1[i-1] + dp0[i-1];
            dp0[i] = dp1[i-1];
        }
        System.out.println(dp1[n] + dp0[n]);
    }
}
