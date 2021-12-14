package com.java.pepcoding.dp;

import java.util.Scanner;

public class CoinChangePermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int tar = sc.nextInt();

        int dp[] = new int[tar + 1];

        dp[0] = 1;

        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < a.length; j++) {
                if (i >= a[j]) {
                    dp[i] = dp[i] + dp[i - a[j]];
                }
            }
        }
        System.out.println(dp[tar]);
    }
}
