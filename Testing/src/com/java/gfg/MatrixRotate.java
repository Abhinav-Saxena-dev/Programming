package com.java.gfg;

import java.util.Scanner;

public class MatrixRotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[7][7];
        for (int i = 0; i < a.length ; i++){
            for (int j=0 ; j<a.length; j++){
                a[i][j] = sc.nextInt();
            }
        }
        rotate(a);
    }

    public static void rotate(int a[][]) {
        for (int j = a.length - 1; j >= 0; j--) {
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
//68 35 1 70 25 79 59 63 65 6 46 82 28 62 92 96 43 28 37 92 5 3 54 93 83 22 17 19 96 48 27 72 39 70 13 68 100 36 95 4 12 23 34 74 65 42 12 54 69