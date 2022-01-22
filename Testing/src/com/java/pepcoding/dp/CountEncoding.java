package com.java.pepcoding.dp;

import java.util.Scanner;

public class CountEncoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int dp[] = new int[str.length()];
        dp[0] = 1;
        for(int i = 1; i < dp.length; i++){
            if(str.charAt(i-1) == '0' && str.charAt(i) == '0'){
                dp[i] = 0;
            }
            else if(str.charAt(i-1) == '0' && str.charAt(i) != '0'){
                dp[i] = dp[i - 1];
            }
            else if(str.charAt(i-1) != '0' && str.charAt(i) == '0'){
                dp[i] = i >= 2 ? dp[i-2] : dp[0];
            }
            else{
             dp[i] += dp[i-1];
             if(Integer.parseInt(str.substring(i-1,i+1)) <= 26){
                 dp[i] += i >= 2 ? dp[i-2] : dp[0];
             }
            }
        }
        System.out.println(dp[str.length()-1]);
    }
}