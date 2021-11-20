package com.java.gfg;

import java.util.Scanner;

public class MinStepsProdOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            a[i] = sc.nextInt();
        }
        System.out.println(makeProductOne(a, n));
    }
    public static int makeProductOne(int[] arr, int n) {
        int steps = 0;
        int prod = 1;
        int zero = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] > 0){
                steps += arr[i] - 1;
            }
            else if(arr[i] < 0){
                steps += -1 - (arr[i]);
                prod *= -1;
            }
            else if(arr[i] == 0){
                zero++;
            }
        }
        if(prod > 0){
            steps = steps + zero;
        }
        else {
            if(zero > 0){
                steps = steps + zero;
            }
            else{
                steps = steps + 2;
            }
        }
        return steps;
    }
}
