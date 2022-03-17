package com.java.LubBabbar.Arrays;

import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
//            reverseArray(a, 0, n-1);
            reverseArrayRec(a, 0, n - 1);
            for (int i : a) {
                System.out.println(i);
            }
            t--;
        }
    }

    public static void reverseArray(int a[], int start, int end) {
        int temp;
        while (start < end) {
            temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }

    public static void reverseArrayRec(int a[], int start, int end) {
        if(start >= end){
            return;
        }
        int temp;
        temp = a[start];
        a[start] = a[end];
        a[end] = temp;
        reverseArrayRec(a, start + 1, end - 1);
    }
}
