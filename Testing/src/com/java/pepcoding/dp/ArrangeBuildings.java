package com.java.pepcoding.dp;

import java.util.Scanner;

public class ArrangeBuildings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dpb[] = new int[n+1];
        int dps[] = new int[n+1];
        dps[1] = 1;
        dpb[1] = 1;
        for(int i = 2; i <= n; i++){
            dpb[i] = dps[i-1];
            dps[i] = dps[i-1] + dpb[i-1];
        }
        int total = dps[n] + dpb[n];
        System.out.println(total * total);
    }
}
