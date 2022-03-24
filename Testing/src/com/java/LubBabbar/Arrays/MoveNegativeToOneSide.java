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
        int i = 0;
        int j = n - 1;
        int temp = 0;
        while(i <= j){
            if(a[i] < 0 && a[j] < 0){
                j--;
            }
            else if(a[i] < 0 && a[j] > 0){
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
            else if(a[i] > 0 && a[j] > 0){
                i++;
            }
            else{
                i++;
                j--;
            }
        }
        for(int s : a){
            System.out.println(s);
        }
    }
}
