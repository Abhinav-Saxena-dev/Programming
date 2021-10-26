package com.java.pepcoding.recursion;

import java.util.Scanner;

public class ArrayindicesRec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(findIndices(a,0,d));
    }
    public static int findIndices(int a[], int ind, int d){
        if(a.length == ind){
            return -1;
        }
        int iosa = findIndices(a, ind +1, d);
        if(a[ind] == d){
            System.out.println(ind);
            return ind;
        }
        else
            return iosa;
    }
}
