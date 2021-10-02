package com.java.gfg;

public class CountWaysStairs {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(ways(n));
    }
    public static int ways(int n){
        if(n <= 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        int nm1 = ways(n-1);
        int nm2 = ways(n - 2);
        return nm1 + nm2;
    }
}
