package com.java.pepcoding.recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class getStairsPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> list = getPath(n);
        System.out.println(list);
    }
    public static ArrayList<String> getPath(int n){
        if(n == 0){
            ArrayList<String> al = new ArrayList<String>();
            al.add("");
            return al;
        }
        if(n < 0){
            ArrayList<String> al = new ArrayList<String>();
            return al;
        }
        ArrayList<String> path1 = getPath(n - 1);
        ArrayList<String> path2 = getPath(n - 2);
        ArrayList<String> path3 = getPath(n - 3);
        ArrayList<String> paths = new ArrayList<String>();

        for(String s : path1){
            paths.add(1 + s);
        }
        for(String s : path2){
            paths.add(2 + s);
        }
        for(String s : path3){
            paths.add(3 + s);
        }
        return paths;
    }
}
