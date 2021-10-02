package com.java.gfg;

import java.util.*;

public class TripletSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> li = new ArrayList<Integer>();
        int k = sc.nextInt();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            li.add(a);
        }
        int count=0;
        int flag = 1;
        List<Integer> li2 = li.subList(flag, li.size());
        int elem = 0;
        int elem2 = 0;
        for(int i = 0; i< li.size();i++){
            li.remove(0);
            for(int j = 0; j<li2.size();j++){
                if(li.contains(k - i - j)){
                    count++;
                }
            }
            li2.remove(0);
        }
        System.out.println(count);
    }
}
