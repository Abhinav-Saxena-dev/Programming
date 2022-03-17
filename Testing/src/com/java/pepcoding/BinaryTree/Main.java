package com.java.pepcoding.BinaryTree;

import java.util.Stack;

public class Main {

    public static class Node{
        int data;
        Node left;
        Node right;

        public  Node(int data, Node left, Node right){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static class Pair{
        Node node;
        int state;

        public Pair(Node node, int state){
            this.node = node;
            this.state = state;
        }
    }

    public static class BinaryTree{
        Node root = null;

        public void constructTree(Integer a[]){
            Stack<Pair> stack = new Stack<Pair>();
            root = new Node(a[0], null, null);
            Pair rootp = new Pair(root, 0);
            stack.push(rootp);
            int index = 0;

            while(stack.size() > 0) {
                Pair top = stack.peek();
                if (top.state == 0) {
                    index++;
                    if (a[index] != null) {
                        top.node.left = new Node(a[index], null, null);
                        Pair lp = new Pair(top.node.left, 0);
                        stack.push(lp);
                    } else {
                        top.node.left = null;
                    }
                    top.state++;
                } else if (top.state == 1) {
                    index++;
                    if (a[index] != null) {
                        top.node.right = new Node(a[index], null, null);
                        Pair rp = new Pair(top.node.right, 0);
                        stack.push(rp);
                    } else {
                        top.node.right = null;
                    }
                    top.state++;
                }
                else if (top.state == 2) {
                    stack.pop();
                }
            }
        }

        public void display(Node node){
            if(node == null){
                return;
            }

            String str = "";

            str += node.left == null ? "." : node.left.data;
            str += "<-" + node.data + "->";
            str += node.right == null ? "." : node.right.data;

            System.out.println(str);

            display(node.left);
            display(node.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        Integer a[] = {50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null, null};
        bt.constructTree(a);
        bt.display(bt.root);
    }
}
