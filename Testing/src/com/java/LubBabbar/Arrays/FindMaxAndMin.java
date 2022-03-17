package com.java.LubBabbar.Arrays;

import java.util.Scanner;

public class FindMaxAndMin {        // Other ways are divide and conquer.

    class pair{
        long first, second;
        public pair(long first, long second){
            this.first = first;
            this.second = second;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a[] = new long[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        FindMaxAndMin obj = new FindMaxAndMin();
        pair pair = obj.getMaxMinPairMethod(a, n);
        System.out.println(pair.first + " " + pair.second);
    }
    public pair getMaxMinPairMethod(long a[], long n){
        int i;
        long max = 0;
        long min = 0;
        if(n%2 == 0){
            if(a[0] > a[1]){
                max = a[0];
                min = a[1];
            }
            else{
                max = a[1];
                min = a[0];
            }
            i = 2;
        }
        else{
            max = min = a[0];
            i = 1;
        }
        while(i < n-1){
            if(a[i] > a[i+1]) {
                if (a[i] > max) {
                    max = a[i];
                }
                if(a[i+1] < min){
                    min = a[i+1];
                }
            }
            else{
                if(a[i+1] > max){
                    max = a[i+1];
                }
                if(a[i] < min){
                    min = a[i];
                }
            }
            i += 2;
        }
        return new pair(max, min);
    }
}