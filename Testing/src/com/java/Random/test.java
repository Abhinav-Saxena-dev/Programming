package com.java.Random;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        if (k > 0)
        {
            for (int j = 0; j < k; j++) { //trick to rotate an array right n no. of times.
                int t = a[n - 1];
                for (int i = n - 1; i > 0; i--) {
                    a[i] = a[i - 1];
                }
                    a[0] = t;
            }
        }
        else{
            for (int j = 0; j < Math.abs(k); j++){
             int t= a[0] ;
             for(int i=0; i<n-1; i++){
                 a[i]= a[i+1];
             }
             a[n-1] = t;
            }
        }
        for (int i : a)
            System.out.print(i + " ");
    }
}