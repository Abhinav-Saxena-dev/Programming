package com.java.Random;

import java.util.ArrayList;
import java.util.Scanner;

public class SubSequenceArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        String set = "";
        int rem = 0;
        int temp = 0;
        int limit = (int)Math.pow(2, n);
        for(int i = 0; i < limit; i++){
            temp = i;
            set = "";
            for(int j = a.length - 1; j >= 0 ; j--){
                rem = temp % 2;
                temp = temp / 2;

                if(rem == 0){
                    set = "- " + set;
                }
                else{
                    set = a[j] + " " + set;
                }
            }
            System.out.println(set);
        }
    }
}
