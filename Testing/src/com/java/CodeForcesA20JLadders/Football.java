package com.java.CodeForcesA20JLadders;

import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int c = 1;
        for (int i = 0; i < n.length() - 1; i++) {
            if (n.charAt(i) == n.charAt(i + 1))
                c++;
            else
                c = 1;
            if (c == 7) {
                break;
            }
        }
        if (c == 7) {
            System.out.println("YES");

        } else
            System.out.println("NO");
    }
}
