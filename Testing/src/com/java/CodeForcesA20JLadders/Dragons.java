package com.java.CodeForcesA20JLadders;

import java.util.*;

public class Dragons {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int oh= sc.nextInt(); //original health
        int nd=sc.nextInt(); //no. of dragons.
        List<Integer> h=new ArrayList<Integer>(); //health
        List<Integer> b=new ArrayList<Integer>(); //bonus
        for(int i=0;i<nd;i++){
            h.add(sc.nextInt());
            b.add(sc.nextInt());
        }
        int count=0;
        int flag=0;
       ListIterator<Integer> it= h.listIterator();
        while(it.hasNext()){
            count=it.nextIndex(); //iterator.nextIndex should be used before it.next();
            if(oh>it.next()){
                oh=oh+b.get(count);
                it.remove();
                b.remove(count);
                flag++;
                it= h.listIterator(); //takes the iterator back to starting.
            }
        }
        if(flag==nd){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
