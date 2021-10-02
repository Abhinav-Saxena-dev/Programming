package com.java.CodeForcesA20JLadders;

import java.io.*;
import java.util.*;

public class ShooshunsAndSeq {

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count =0;
        List<Integer> li = new ArrayList<Integer>();
        for(int i =0; i<n; i++){
            li.add(sc.nextInt());
        }
        while (n>0) {
            if (!checkIfEqual(li)) {
                li = operation(li, k);
                count++;
            } else {
                System.out.println(count);
                return;
            }
            n--;
        }
        System.out.println(-1);
    }

    public static List<Integer> operation(List<Integer> list, int k){
        int num = list.get(k-1);
        list.add(num);
        list.remove(0);

        return list;
    }

    public static boolean checkIfEqual(List<Integer> list){
        return new HashSet<Integer>(list).size() <= 1;
    }

    static class FastReader {
            BufferedReader br;
            StringTokenizer st;

            public FastReader()
            {
                br = new BufferedReader(
                        new InputStreamReader(System.in));
            }

            String next()
            {
                while (st == null || !st.hasMoreElements()) {
                    try {
                        st = new StringTokenizer(br.readLine());
                    }
                    catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                return st.nextToken();
            }

            int nextInt() { return Integer.parseInt(next()); }

            long nextLong() { return Long.parseLong(next()); }

            double nextDouble()
            {
                return Double.parseDouble(next());
            }

            String nextLine()
            {
                String str = "";
                try {
                    str = br.readLine();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
                return str;
            }
        }

    }
