package com.java.CodeChef;

import java.util.Scanner;

public class ThreeBoxes2 {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a, b, c, d;
        while (t > 0) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            d = sc.nextInt();
            if((a + b + c) <= d ){
                System.out.println(1);
            }
            else if(a + b <= d){
                System.out.println(2);
            }
            else{
                System.out.println(3);
            }
            t--;
        }
        }
    }


