package com.java.pepcoding.dp;

import java.util.Scanner;

public class getStairPathCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(getCount(n));
    }
    public static int getCount(int n){
        if(n == 0){
            return 1;
        }
        else if(n < 0){
            return 0;
        }
//        int m1 = getCount(n-1, arr);
//        int m2 = getCount(n-2, arr);
//        int m3 = getCount(n-3, arr);
        int m1 = getCount(n-1);
        int m2 = getCount(n-2);
        int m3 = getCount(n-3);
        int totalCount = m1 + m2 + m3;

        return totalCount;
    }
}
