package com.java.LubBabbar.Arrays;

import java.util.Scanner;

public class MoveNegativeToOneSide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int j = 0, temp;
        for (int i = 0; i < n; i++) {
            if (a[i] < 0) {
                if (i != j) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                j++;
            }
        }
        for(int s : a){
            System.out.println(s);
        }
    }
}
