package com.java.pepcoding.recursion;

import java.util.Scanner;

public class firstIndexArrayRec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(firstInx(a,0, d));
    }
    public static int firstInx(int a[], int idx, int d){
        if(a.length == idx){ // notice we are moving this recursion till a.length and not a.length-1;
            return -1;
        }
        if(a[idx]==d){
            return idx;
        }
        else{
            int fi = firstInx(a, idx+1, d);
            return fi;
        }
    }
}


/*      if(a.length == idx){    This code is logically correct but it is not efficient as the values will be checked when returning back from the stack.
            return -1;          This code will better suit for finding Index of Last Occurrence of a number
        }
        int fi = firstInx(a, idx+1, d);
        if(a[idx]==d){
            return idx;
        }
        return fi;*/