package com.java.CollectionTest;

import java.util.*;

public class LinkedListTest {
    public static void main(String[] args) {
        List<String> li=new LinkedList<String>(); // doubly list, we can add and remove from both the sides, unlike array list.
        List<String> li2=new LinkedList<String>();
        for(int i=0;i<10;i++){
            li.add("Hii"+i); //we can use add just like array list.
            li2.add(""+i);
        }
        System.out.println(li);
        System.out.println(li2);
        li.addAll(li2); //this will add all the elements of li2 at the end of the list. we can use addAll(index, ---) to insert all the elements from a specific index.
        System.out.println(li);
        // there are also addFirst() and addLast() but they are not available in the Link interface, even if the list is an instance of LinkedList, the type of the reference variable needs to be LInkedList.
        remove(li,li2);
        reverse((LinkedList<String>) li); //typecasting the list, li is of type List, the parent, but descendingIterator can only be used with LinkedList.

    }
    public static void remove(List<String> list, List<String> list2){   // A function that takes a list of type List and removes elements from it.
      list.removeAll(list2);  // there are removeFirst() and removeLast() too, but can't be used with Link as type of reference variable.
      list.remove(0);
        System.out.println(list); //the first element the list2 are removed from the list1.
    }
    public static void reverse(LinkedList<String> list){  // A function that takes a list of type List and reverses it.
      Iterator<String> i=list.descendingIterator(); //descending iterator is also something that can only be used with LinkedList interface.
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
