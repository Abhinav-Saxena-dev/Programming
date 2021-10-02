package com.java.gfg;
import java.util.*;
public class TrapRainWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int t = 0;
        int pref[] = new int[n];
        int suff[] = new int[n];
        for(int i = 0; i < n ; i++){
            if(t < a[i])
                t = a[i];
            pref[i] = t;
        }
        t = 0;
        for(int i = n-1; i >= 0 ; i--){
            if(t < a[i])
                t = a[i];
            suff[i] = t;
        }
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum = sum + (int)Math.min(pref[i],suff[i]) - a[i];
        }
        System.out.println(sum);
    }
}

