package com.java.pepcoding.recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintEncodings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        printEncoding("", s);
    }
    public static void printEncoding(String ans, String ques){
        if(ques.length() == 0){
            System.out.println(ans);
            return;
        }
        else if(ques.length() == 1){
            char ch = ques.charAt(0);
            if(ch == '0'){
                return;
            }
            else{
                int code = ch - '0';
                char res = (char)('a' + code - 1);
                ans = ans + res;
                System.out.println(ans);
            }
        }
        else{
            char ch = ques.charAt(0);
            String roq = ques.substring(1);
            if(ch == '0'){
                return;
            }
            else{
                int code = ch - '0';
                char res = (char)('a' + code - 1);
                printEncoding(ans+res,roq);
            }
            String ch12 = ques.substring(0, 2);
            String roq12 = ques.substring(2);

            int ch12v = Integer.parseInt(ch12);
            if(ch12v <= 26){
                char code = (char)('a' + ch12v - 1);
                printEncoding(ans+code, roq12);
            }
        }
    }
}
