package com.java.pepcoding.dp;

import java.util.Scanner;

public class MinimumCostPathMaze {
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
        for(int i = row - 1; i >= 0; i--){
            for(int j = col - 1; j >= 0; j-- ){
                if(i == row - 1 && j == col - 1){
                    dp[i][j] = maze[i][j];
                }
                else if(i == row - 1){
                    dp[i][j] = dp[i][j + 1] + maze[i][j];
                }
                else if(j == col - 1){
                    dp[i][j] = dp[i + 1][j] + maze[i][j];
                }
                else{
                    dp[i][j] = maze[i][j] + Math.min(dp[i+1][j],dp[i][j+1]);
                }
            }
        }
        System.out.println(dp[0][0]);
    }
}
