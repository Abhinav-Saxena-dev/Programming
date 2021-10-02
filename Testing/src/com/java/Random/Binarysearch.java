package com.java.Random;

import java.util.Scanner;

public class Binarysearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int elem = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i]=sc.nextInt();
        }
        int beg = 0;
        int end = n-1;
        int pos = -1;
        int mid = 0;
        while(beg <= end){
            mid = (beg + end)/2;
            if(a[mid] == elem){
                pos = mid;
                break;
            }
            else if(a[mid] > elem){
                end = mid - 1;
            }
            else{
                beg = mid + 1;
            }
        }
        System.out.println(pos!=-1 ? ("FOUND" + pos) : ("NOT FOUND"));
    }
}
