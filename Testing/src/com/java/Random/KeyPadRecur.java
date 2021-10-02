package com.java.Random;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KeyPadRecur {
    static String a[] = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        List<String> li = combi(n);
        System.out.println(li);
    }
    public static List<String> combi(String n) {
        if(n.length()==0){
            List<String> list = new ArrayList<String>();
            list.add("");
            return list;
        }
        char c= n.charAt(0);
        List<String> li = combi(n.substring(1));
        List<String> li2 = new ArrayList<String>();
        String str = a[c - '0'];
        for(int i =0; i < str.length(); i++){
            for(String s : li){
                li2.add(s+str.charAt(i));
            }
        }
        return li2;
    }
    }

