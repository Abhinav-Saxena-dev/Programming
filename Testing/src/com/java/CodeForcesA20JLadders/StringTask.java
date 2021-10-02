package com.java.CodeForcesA20JLadders;

import java.util.Scanner;
public class StringTask {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.toLowerCase();
        String n="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='a'&&s.charAt(i)!='e'&&s.charAt(i)!='o'&&s.charAt(i)!='i'&&s.charAt(i)!='u'&& s.charAt(i)!='y')
                n= n+'.'+s.charAt(i);
        }
        System.out.println(n);
    }
}
