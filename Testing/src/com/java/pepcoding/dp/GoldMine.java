package com.java.pepcoding.dp;

import java.util.Scanner;

public class GoldMine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int maze[][] = new int[row][col];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                maze[i][j] = sc.nextInt();
            }
        }
        int dp[][] = new int[row][col];
        for(int i = col - 1; i >= 0; i--){
            for(int j = row - 1; j >= 0; j--){
                if(i == col - 1){
                    dp[j][i] = maze[j][i];
                }
                else if(j == 0){
                    dp[j][i] = maze[j][i] + Math.max(dp[j][i+1],dp[j+1][i+1]);
                }
                else if(j == row - 1){
                    dp[j][i] = maze[j][i] + Math.max(dp[j][i+1],dp[j-1][i+1]);
                }
                else{
                    dp[j][i] = maze[j][i] + Math.max(dp[j][i+1],Math.max(dp[j-1][i+1],dp[j+1][i+1]));
                }
            }
        }
        for(int i = 0; i < row - 1; i++){
            System.out.println(dp[i][0]);   // use another array to find out the max from first column and then print.
        }
    }
}
