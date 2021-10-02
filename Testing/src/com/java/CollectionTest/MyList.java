package com.java.CollectionTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyList {
    //ArrayList list=new ArrayList(); old non-genric ArrayList.

    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<String>();// new genric Array List
        arrList.add("Manu");
        arrList.add("Man");
        //display(arrList);
        List<String> list = new ArrayList<String>();   //using List this way is better. Parent interface can be the type of all child class or interface objects
        list.add("Chunky");
        list.add("Hiii");
        arrList.add("Gooo");
        //display(list);
        System.out.println(list);   // we can print the list this way, it'll be printed in square brackets.
        System.out.println(arrList);
        List<Integer> liInt = new ArrayList<Integer>();
        for (int i = 1; i < 5; i++)
            liInt.add(i);
        System.out.println(liInt);
        System.out.println(liInt.get(3)); //get gives us the number at the given index.
        liInt.set(2, 5); // by using add(2, 5), we'll simply add the number 5 at position index 2, and the former number at index 2 will shift forward to 3.
        System.out.println(liInt); //Using set simply replaces.
		// we can use the enhanced for loop to traverse through a list, or we can also use the iterator or ListIterator.
		Collections.sort(arrList);
		Collections.sort(list);   //Collections.sort() sorts the list.
		System.out.println(list);
		System.out.println(arrList);
    }   //there is also retainAll(), addAll(); remove(); clear();


    /*public static void display(ArrayList<String> list) { should we use this, we won't be able to send list inside this as during compile time only the reference variable is checked, and List won't be able to send it.
        for(String str : list ) {
            System.out.println(str);
        }*/
    /*public static void display(List<String> list) { //Using this the parent interface; we can send the child elements into it.
        for (String str : list) {
            if (str.equals("Man")) {
                list.set(1, "asdas");
            }
            System.out.println(str);
        }*/
}
