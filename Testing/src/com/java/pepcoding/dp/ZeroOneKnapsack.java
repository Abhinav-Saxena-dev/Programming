package com.java.pepcoding.dp;

import java.util.Scanner; // remember the cricket example, 2-15 meaning iss batsman ko 2 ball chahiye or yeh 15 run banayega.

public class ZeroOneKnapsack {
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

        int dp[][] = new int[n+1][cap + 1];

        for(int i = 1; i < dp.length; i++){
            for(int j = 1; j < dp[0].length; j++){
                if( j >= wts[i - 1]){
                    int rem = j - wts[i - 1]; // bachi hui balls, ya fir kitna weight bacha hai.
                    if(dp[i-1][rem] + val[i-1] > dp[i-1][j]){
                        dp[i][j] = dp[i-1][rem] + val[i-1];
                    }
                    else{
                        dp[i][j] = dp[i-1][j]; // agar yeh batsman batting na kare, or we don't count this item.
                    }
                }
                else{
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        System.out.println(dp[n][cap]);
    }
}
