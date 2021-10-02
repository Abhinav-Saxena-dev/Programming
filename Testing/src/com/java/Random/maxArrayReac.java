package com.java.Random;

import java.util.Scanner;

public class maxArrayReac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        findMax(a, 0);
    }

    public static int findMax(int a[], int ind) {
        if (a.length - 1 == ind) {
            return a[ind];
        }
        int max = findMax(a, ind + 1);
        if(max > a[ind]){
            return max;
        }
        return a[ind];
    }
}
