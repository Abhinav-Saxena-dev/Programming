package com.java.Random;

public class reverseStringRecur {
    public static void main(String[] args) {
        String s = "abc";
        String str = "";
        reverse(str, s);
    }

    private static void reverse(String str, String s) {
        if(s.length()==0){
            System.out.println(str);
            return;
        }
        else {
            // return reverse(s.substring(1,s.length())) + s.charAt(0);
            for (int i = 0; i < s.length(); i++)
                 reverse(s.charAt(i) + str, s.substring(i + 1));
        }
    }
}
