package com.java.gfg;

public class FriendPairing {
    public static void main(String[] args) {
        int n = 5;
        System.out.println((n > 3) ? countFriendsPairings(n) : n);
    }

    static int countFriendsPairings(int n)
    {
        int result=0;
        int pr=1, cr=2; // previous answer and current answer.
        for(int i=3; i<=n; i++){
            result = (i-1)*pr + cr;
            pr = cr;
            cr = result;
        }
        return result;
    }
}
