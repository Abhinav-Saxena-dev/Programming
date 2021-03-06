package com.java.LubBabbar.Arrays;

import java.util.Scanner;

public class KadaneAlgorithnFindMaxSumContArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int max_ending_here = 0;
        int max_so_far = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            max_ending_here = max_ending_here + a[i];
            if(max_so_far < max_ending_here){
                max_so_far = max_ending_here;
            }
            if(max_ending_here < 0){
                max_ending_here = 0;
            }
        }
        System.out.println(max_so_far);
    }
}
