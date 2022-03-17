package com.java.pepcoding.GenericTree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<Node>();
    }

    private static class GenericTree {
        Node root = null;

        public void constructTree(int a[]) {
            Stack<Node> st = new Stack<Node>();
            for (int i : a) {
                if (i == -1) {
                    st.pop();
                } else {
                    Node node = new Node();
                    node.data = i;
                    if (st.empty()) {
                        root = node;
                    } else {
                        st.peek().children.add(node);
                    }
                    st.push(node);
                }
            }
        }

        public void displayTree(Node node) {
            String str = node.data + " -> ";
            for (Node child : node.children) {
                str += child.data + " , ";
            }
            System.out.println(str);
            for (Node child : node.children) {
                displayTree(child);
            }
        }

        public int sizeTree(Node node) {
            int size = 0;
            for (Node child : node.children) {
                int child_size = sizeTree(child);
                size = size + child_size;
            }
            size++;
            return size;
        }

        public int findMax(Node node) {
            int max = 0;
            for (Node child : node.children) {
                int child_max = findMax(child);
                max = Math.max(child_max, max);
            }
            max = Math.max(node.data, max);
            return max;
        }
        public int heightTree(Node node){
            int h = -1;  // For Node ke terms we will use h = 0; For edges ke terms we use h = -1;
            for(Node child : node.children){
              int ch = heightTree(child);
              h = Math.max(h, ch);
            }
            h++;
            return h;
        }

        public void traverseLevelOrder(Node node){
            Queue<Node> q = new ArrayDeque<>();
            q.add(node);
            while(q.size() > 0){
                node = q.remove();
                System.out.print(node.data + " ");
                for(Node child : node.children){
                    q.add(child);
                }
            }
            System.out.println(".");
        }
        public void traversalTree(Node node){
            System.out.println("NODE PRE " + node.data);
            for(Node child : node.children){
                System.out.println("EDGE PRE " + node.data + " --- " + child.data);
                traversalTree(child);
                System.out.println("EDGE POST " + node.data + " --- " + child.data);
            }
            System.out.println("NODE POST " + node.data);
        }
    }


    public static void main(String args[]) {
        int a[] = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};
        GenericTree tree = new GenericTree();
        tree.constructTree(a);
        tree.displayTree(tree.root);
        System.out.println("Size -> " + tree.sizeTree(tree.root));
        System.out.println("Max -> " + tree.findMax(tree.root));
        System.out.println("Height -> " + tree.heightTree(tree.root));
        tree.traversalTree(tree.root);
        tree.traverseLevelOrder(tree.root);
    }
}
