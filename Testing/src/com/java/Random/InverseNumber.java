package com.java.Random;

import java.util.*;

public class InverseNumber{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = 0;
        int count = 1;
        int dig = 0;

        while(n > 0){
            dig = n % 10;
            n = n / 10;

            result = result + count*(int)Math.pow(10, dig-1);
            count++;
        }
        System.out.println(result);
    }
}
