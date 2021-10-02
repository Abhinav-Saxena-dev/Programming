package com.java.CodeForcesA20JLadders;
import java.util.Scanner;
public class LittleElephantAndFunc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=1;i<=n;i++){
            a[i-1]=i;
        }
        a= sort(a, a.length-1);
        for(int i: a)
            System.out.print(i+" ");
        }
        public static int[] sort(int a[],int x) {
            if (x == 0) {
                return a;
            } else {
                int t = a[x];
                a[x] = a[x - 1];
                a[x-1]=t;
                return sort(a,x-1);
            }
        }
    }

