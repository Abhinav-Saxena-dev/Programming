package com.java.CodeForcesA20JLadders;

import java.util.Scanner;

public class Puzzles {
    public static void main(String[] args) {
        Scanner sc= new Scanner((System.in));
        int n = sc.nextInt(); // no. of children
        int m = sc.nextInt(); // no. of puzzles
        int p[] = new int[m];
        for(int i=0; i< m; i++){
            p[i] = sc.nextInt();
        }
        p = sort(p);
        int diff = p[p.length-1] - p[0];
        for(int i=0; i<=m-n;i++){
               if(diff > Math.abs(p[i] - p[i+(n-1)])){
                   diff = Math.abs(p[i] - p[i+(n-1)]);
               }
            }

        System.out.println(diff);
        
    }
    public static int[] sort(int a[]){
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    int t= a[j];
                    a[j]=a[j+1];
                    a[j+1] = t;
                }
            }
        }
        return a;
    }
}
