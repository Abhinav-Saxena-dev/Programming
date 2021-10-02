package com.java.Random;

import java.util.Scanner;

public class TowerHanoi {
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        shiftPile(n, 'A', 'C', 'B');
    }
    public static void shiftPile(int n,char A, char C, char B){
        if(n==1){
            System.out.println(n+ " "+ A + " to " + C);
            return;
        }
        shiftPile(n-1, A, B, C);
        System.out.println(n+ " " +A + " to " + C);
        shiftPile(n-1, B,C,A);
    }
}
