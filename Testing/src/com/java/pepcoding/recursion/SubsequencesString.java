package com.java.pepcoding.recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsequencesString {
    public static void main(String[] args) {
        String s = "abcd";
        List<String> li =findSeq(s);
        System.out.println(li);
    }
    public static List<String> findSeq(String s){
         if(s.length() == 0){
             List<String> fe = new ArrayList<String>();
             fe.add(" "); // if we don't send this empty element then the for each will not traverse the list.
             return fe;
         }
         char ch = s.charAt(0);
         List<String> li=findSeq(s.substring(1));
        List<String> res = new ArrayList<String>();
        for(String st : li){
            res.add(st);
            res.add(ch + st);
        }
        return res;
        }
    }

