package com.java.LinkedList;

public class Main {
    public static class Node {
        int data;
        Node next;
    }
    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        public void addLast(int val){
            Node temp = new Node(); // since both if and the else were having  these three lines and size++, we separated them out of the block.
            temp.data = val;
            temp.next = null;

            if(size == 0){
                /*Node temp = new Node();
                temp.data = val;
                temp.next = null;*/
                head = tail = temp;
//                size++;
            }
            else {
                /*Node temp = new Node();
                temp.data = val;
                temp.next = null;*/
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
    }
}
