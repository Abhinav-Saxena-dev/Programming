package com.java.CodeChef;

import java.util.Scanner;

public class HoopJump {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        double result = 0;
        for(int i=0 ; i<t ; i++){
            int n = sc.nextInt();
            double k = n;
            result = (k/2) + 0.5;
            System.out.println((int)result);
        }
    }
}
