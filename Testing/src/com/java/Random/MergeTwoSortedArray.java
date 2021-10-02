package com.java.Random;

import java.util.Scanner;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l1 = sc.nextInt();
        int l2 = sc.nextInt();
        int a[] = new int[l1];
        int b[] = new int[l2];
        for (int i = 0; i < l1; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < l2; i++) {
            b[i] = sc.nextInt();
        }
        int max = (l1 > l2 ? l1 : l2);
        int l3 = l1 + l2;
        int c[] = new int[l3];
        int i = 0, j = 0, k = 0;
        while(k < l3){
            if(a[i] <= b[j]){
                c[k] = a[i];
                k++;
                i++;
            }
            else{
                c[k] = b[j];
                k++;
                j++;
            }
        }
        for(int p : c){
            System.out.println(p);
        }
    }
}
