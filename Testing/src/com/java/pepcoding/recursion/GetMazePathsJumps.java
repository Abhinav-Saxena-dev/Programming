package com.java.pepcoding.recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePathsJumps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(getMazePaths(n , m, 1, 1));
    }
    public static ArrayList<String> getMazePaths(int n, int m, int row, int col){
        if(row == n && col == m){
            ArrayList<String> bres = new ArrayList<String>();
            bres.add("");
            return bres;
        }
        ArrayList<String> paths = new ArrayList<String>();

        //Getting Horizontal Paths
        for(int hm = 1; hm <= m - col ; hm++){
            ArrayList<String> hpaths = getMazePaths(n , m, row, col + hm);
            for( String s : hpaths){
                paths.add("h" + hm + s);
            }
        }
        //Getting Vertical Paths
        for(int vm = 1; vm <= n - row ; vm++){
            ArrayList<String> vpaths = getMazePaths(n , m, row + vm, col);
            for( String s : vpaths){
                paths.add("v" + vm + s);
            }
        }
        //Getting Diagonal Paths
        for(int dm = 1; dm <= m - col && dm <= n- row ; dm++){
            ArrayList<String> dpaths = getMazePaths(n , m, row+dm, col+dm);
            for( String s : dpaths){
                paths.add("d" + dm + s);
            }
        }
        return paths;
    }
}
