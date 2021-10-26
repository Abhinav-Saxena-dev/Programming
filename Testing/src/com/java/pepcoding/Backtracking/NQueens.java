package com.java.pepcoding.Backtracking;

import java.util.Scanner;

public class NQueens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int chess[][] = new int[n][n];
        printQueens(chess, "", 0);
    }
    public static void printQueens(int chess[][], String qsf, int row){

        if(row == chess.length){
            System.out.println(qsf);
            return;
        }

        for(int i = 0; i < chess.length; i++){
            if(isQueenSafe(chess, row , i)){
            chess[row][i] = 1;
            printQueens(chess, qsf + row + "-" + i + ",", row + 1);
            chess[row][i] = 0;
            }
        }
    }
    public static boolean isQueenSafe(int chess[][], int row, int col){
        for(int i = row - 1, j = col; i >= 0; i--){
            if(chess[i][j] == 1){
                return false;
            }
        }
        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--){
            if(chess[i][j] == 1){
                return false;
            }
        }
        for(int i = row - 1, j = col + 1; i >= 0 && j < chess.length; i--, j++){
            if(chess[i][j] == 1){
                return false;
            }
        }
        return true;
    }
}
