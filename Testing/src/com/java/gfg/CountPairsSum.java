package com.java.gfg;

import java.util.*;

public class CountPairsSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> li = new ArrayList<Integer>();
        int k = sc.nextInt();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            li.add(a);
        }
        int count=0;
        int flag = 0;
        List<Integer> li2 = li.subList(1, li.size());
        Iterator<Integer> i = li.iterator();
        int elem = 0;
        while(i.hasNext()){
            elem = i.next();
            i.remove();
             if(li.contains(k - elem)){
                count = count + Collections.frequency(li, k - elem);
             }
        }
        System.out.println(count);
    }
}
