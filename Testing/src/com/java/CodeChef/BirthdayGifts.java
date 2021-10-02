package com.java.CodeChef;

import java.util.Scanner;

public class BirthdayGifts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            long chef1 = 0;
            long  chef2 = 0;
            int n = sc.nextInt();
            if(n<3) return;
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            a = sort(a);
            int c = 1;
            for (int j = 0; j < k; j++) {
                chef2 += a[c];
                c += 2;
            }
            c = 0;
            for (int j = 0; j < k; j++) {
                chef1 += a[c];
                c += 2;
            }
            chef2 = chef2 + a[2 * k];
            System.out.println((chef1 > chef2) ? chef1 : chef2);
            t--;
        }
    }

    public static int[] sort(int a[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] < a[j + 1]) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }
        return a;
    }
}
