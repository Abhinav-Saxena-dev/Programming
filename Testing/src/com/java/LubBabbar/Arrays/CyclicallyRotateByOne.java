package com.java.LubBabbar.Arrays;

import java.util.Scanner;

public class CyclicallyRotateByOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int t;
        for (int i = n - 1; i >= 1; i--) {
            t = a[i];
            a[i] = a[i - 1];
            a[i - 1] = t;
        }
        for(int i : a){
            System.out.print(i + " ");
        }
    }
}
