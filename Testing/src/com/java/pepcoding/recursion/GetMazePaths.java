package com.java.pepcoding.recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int r,c;
        r = c =1;
        System.out.println(mazePaths(n,m,r,c));
    }

    public static ArrayList<String> mazePaths(int n, int m, int r, int c){
        if(r == n && c == m){
            ArrayList<String> li = new ArrayList<String>();
            li.add("");
            return li;
        }
        ArrayList<String> vp = new ArrayList<String>();
        ArrayList<String> hp = new ArrayList<String>();

        if(c < m){
            hp = mazePaths(n, m, r, c+1);
        }
        if(r < n){
            vp = mazePaths(n, m, r+1, c);
        }

        ArrayList<String> paths = new ArrayList<String>();
        for(String s : vp){
            paths.add("v" + s);
        }
        for(String s : hp){
            paths.add("h" + s);
        }
        return paths;
    }
}
