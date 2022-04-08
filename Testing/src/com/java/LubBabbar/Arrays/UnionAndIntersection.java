package com.java.LubBabbar.Arrays;

import java.util.Scanner;

public class UnionAndIntersection {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int m = sc.nextInt();
        int b[] = new int[m];

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < m; i++){
            b[i] = sc.nextInt();
        }
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < n && j < m){

            while(a[i] > b[j]){
                k++;
                j++;
            }
            if(a[i] == b[j]){
                k++;
                i++;
                j++;
            }
            while(a[i] < b[j]){
                k++;
                i++;
            }
        }

        while(i < n){
            k++;
            i++;
        }
        while(j < m){
            k++;
            i++;
        }
    }
}
