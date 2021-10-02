package com.java.Random;

import java.util.*;

public class RestoringThePermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int q[] = new int[n];
            int pmin[] = new int[n];
            int pmax[] = new int[n];
            for (int j = 0; j < n; j++) {
                q[j] = sc.nextInt();
            }
            pmin = setPermutation(q);
            pmax = max(q);

            for(int k : pmin){
                System.out.print(k + " ");
            }
            System.out.println();
            for (int l : pmax){
                System.out.print(l + " ");
            }
        }
    }

    public static int[] setPermutation(int q[]) {
        int p[] = new int[q.length];
        int used[] = new int[q.length];
        int count = 0;
        p[0] = q[0];
        used[0] = q[0];
        for (int i = 1; i < q.length; i++) {
            if(q[i]>q[i-1]){
                p[i]=q[i];
                used[i] = q[i];
                continue;
            }
            for (int j = 1; j <= q[q.length - 1]; j++) {
                count =0;
                 for (int k=0; k<used.length;k++){
                     if(used[k] == j)
                         count++;
                 }
                 if(count==0 && q[i]==q[i-1] && j<q[i-1] ){
                     p[i] = j;
                     used[i] = j;
                     break;
                 }
            }
        }
        return p;
    }
    public static int[] max(int q[]){
        int p[] = new int[q.length];
        int used[] = new int[q.length];
        int count = 0;
        p[0] = q[0];
        used[0] = q[0];
        for (int i = 1; i < q.length; i++) {
            if(q[i]>q[i-1]){
                p[i]=q[i];
                used[i] = q[i];
                continue;
            }
            for (int j = 1; j <= q[q.length - 1]; j++) {
                count =0;
                for (int k=0; k<used.length;k++){
                    if(used[k] == j)
                        count++;
                }
                if(count==0 && q[i]==q[i-1] && j<q[i-1] ){
                    p[i] = j;
                    used[i] = j;
                }
            }
        }
        return p;
    }
}