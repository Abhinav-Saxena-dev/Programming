package com.java.CollectionTest;

import java.util.LinkedHashSet;

public class LinkHashSet {
    int n=0;
    String k, f;
    public static void main(String[] args) { // LinkedHashSet contains unique elements only, and maintains insertion order, and allows null values.
     LinkedHashSet<String> lhs = new LinkedHashSet<String>();
     lhs.add("ravi");
     lhs.add("vijay");
     lhs.add("ajay");
     lhs.add("ravi");
     lhs.add("kangan");
     System.out.println(lhs);

     LinkedHashSet<LinkHashSet> hs = new LinkedHashSet<LinkHashSet>(); //only allow variables of type LinkHashSet which is the name of this class.
     LinkHashSet ob1 = new LinkHashSet(101, "Hiiii", "you mother ass");
     hs.add(ob1);
     for(LinkHashSet l : hs){
         System.out.println(l.n +" "+ l.f+" "+l.k);
     }
        System.out.println(ob1.f);
    }
    public LinkHashSet(int n, String k, String f){
        this.n = n;
        this.k = k;
        this.f = f;
    }
}
