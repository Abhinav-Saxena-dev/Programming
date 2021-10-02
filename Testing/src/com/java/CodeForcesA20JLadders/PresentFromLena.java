package com.java.CodeForcesA20JLadders;

import java.util.Scanner;

public class PresentFromLena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = n + 1;
        int a = n - 1;
        for (int i = 1; i <= n; i++) {
            int c = 0;
            for (int k = 1; k <= a * 2; k++) {
                System.out.print(" ");
            }
            a--;
            for (int j = 0; j < i * 2 - 1; j++) {
                if (j >= i)
                    c = c + 2;
                System.out.print(letter(j, i, c) + " ");
            }
            System.out.println();
        }
        a = 1;
        for (int i = n - 1; i >= 1; i--) {
            int c = 0;
            for (int k = 1; k <= a * 2; k++) {
                System.out.print(" ");
            }
            a++;
            for (int j = 0; j < i * 2 - 1; j++) {
                if (j >= i)
                    c = c + 2;
                System.out.print(letter(j, i, c) + " ");
            }
            System.out.println();
        }
    }

    public static int letter(int a, int b, int c) {
        if (a >= b)
            return a - c;
        else
            return a;
    }
}
