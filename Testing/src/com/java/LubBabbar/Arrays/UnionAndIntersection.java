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

            if(a[i] < b[j]){
                i++;
                k++;
            }
            else if(a[i] > b[j]){
                j++;
                k++;
            }
            else{
                i++;
                j++;
                k++;
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
