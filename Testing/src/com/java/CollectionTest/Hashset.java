package com.java.CollectionTest;


import java.util.*;

public class Hashset {
    public static void main(String[] args) { // hashing mechanism is used by hashSet, unique elements are stored, insertion order is not maintained.
        HashSet<String> set = new HashSet<String>();   // best for search operations.
        HashSet<String> set2=new HashSet<String>();
        List<Integer> li=new ArrayList<Integer>();
        li.add(1);
        li.add(2);
        li.add(3);
        HashSet setLi=new HashSet(li);  // converting a list into a HashSet.
        System.out.println(setLi);
        set.add("One");
        set.add("two");
        set.add("three");
        set.add("two");   //does not take duplicate elements.
        System.out.println(set);
        for (int i=0;i<5;i++){
            set2.add("Hii"+i);
        }
        set.addAll(set2);
        System.out.println(set);  //you will see that they all will be non synchronized.
        removal(set,set2);
    }
    public static void removal(HashSet<String> set,HashSet<String> set2){
        set.remove("two");
        System.out.println("removed two"+set);
        set.removeAll(set2);
        System.out.println("removed set2"+set);
        /*set.removeIf(set2->set2.contains("Hii2")); Not working for some reason.*/
        set.clear();
        System.out.println(set);

    }
}
// set.size();
