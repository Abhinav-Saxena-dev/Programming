package com.java.CodeForcesA20JLadders;

import java.util.*;

public class chartRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String he = "hello";
        int count = 0;
        for(int i=0 ; i<s.length(); i++){
            if(s.charAt(i) == he.charAt(count)){
                count++;
            }
            if(count == 5){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
