package com.java.pepcoding.dp;

import java.util.Scanner;

public class UnboundedKnapsack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val[] = new int[n];
        int wts[] = new int[n];
        for(int i = 0; i < n; i++){
            val[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            wts[i] = sc.nextInt();
        }
        int cap = sc.nextInt();
        int dp[] = new int[cap + 1];
        dp[0] = 0;
        for(int i = 1 ; i < dp.length; i++){
            int max = Integer.MIN_VALUE;
            for(int j = 0; j < n; j++){
                if(i >= wts[j]) {
                    max = Math.max(max, dp[i - wts[j]] + val[j]);
                }
            }
            if(max != Integer.MIN_VALUE){
                dp[i] += max;
            }
        }
        System.out.println(dp[cap]);
    }
}
