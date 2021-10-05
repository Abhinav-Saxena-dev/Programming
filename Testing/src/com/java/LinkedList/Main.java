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

        public void addLast(int val) {
            Node temp = new Node(); // since both if and the else were having  these three lines and size++, we separated them out of the block.
            temp.data = val;
            temp.next = null;

            if (size == 0) {
                /*Node temp = new Node();
                temp.data = val;
                temp.next = null;*/
                head = tail = temp;
//                size++;
            } else {
                /*Node temp = new Node();
                temp.data = val;
                temp.next = null;*/
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        public void display() {
            Node temp = head;
            if (size == 0) {
                System.out.println("List is empty");
            }
            while (temp.next != null) {
                System.out.print(temp.data + "  ");
                temp = temp.next;
            }
            System.out.println();
        }

        public void removeFirst() {
            if (size == 0) {
                System.out.println("List is empty");
            } else if (size == 1) {
                head = tail = null;
            } else {
                Node temp = head;
                head = temp.next;
                size--;
            }
        }

        public int getValue(int index) {
            Node temp = head;
            if (index > size || index < 0) {
                return -1;
            } else {
                for (int i = 0; i < index - 1; i++) {
                    temp = temp.next;
                }
            }
            return temp.data;
        }
        public void addFirst(int val){
            Node temp = new Node();
            temp.next = head;
            temp.data = val;
            head = temp;
            if(size == 0){
                tail = temp;
            }
            size++;
        }
        public void addAt(int index, int val){
            Node temp = head;
            Node newNode = new Node();
            if(index > size || index < 0){
                System.out.println("Invalid index");
                return;
            }
            else if(index == 0){
                addFirst(val);
            }
            else if(index == size){
                addLast(val);
            }
            else{
                for(int i = 0; i < index - 1; i++){ // it's not index - 2 because we WANT TO replace it At the value of index.
                    temp = temp.next;
                }
                newNode.data = val;
                newNode.next = temp.next;
                temp.next = newNode;
            }
            size++;
        }
        public void removeAt(int index){
            Node temp = head;
            if(size == 0){
                System.out.println("List is empty");
            }

        }
    }

    public static void main(String[] args) {
        LinkedList ob = new LinkedList();
        ob.addLast(10);
        ob.addLast(12);
        ob.addLast(15);
        ob.addLast(20);
        ob.addLast(19);
        ob.addLast(14);
        ob.addLast(23);
        ob.display();
        ob.removeFirst();
        ob.display();
        System.out.println(ob.getValue(-1));
        ob.addAt(2, 10);
        ob.display();
    }
}
