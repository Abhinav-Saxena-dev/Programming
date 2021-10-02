package com.java.Random;

import java.io.*;
import java.util.*;

public class Transportation{

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        int r = 0;
        int sume =0;
        int sumo = 0;
        String a[] = new String[t];
        int count = 0;
        while(t > 0){
            int n = sc.nextInt();
            sume = 0;
            sumo = 0;
            while(n>0){
                r = n%10;
                if(r%2==0){
                    sume = sume + r;
                }
                else{
                    sumo = sumo + r;
                }
                n = n/10;
            }
            a[count] = sume%4==0 || sumo%3==0 ? "YES" : "NO" ;
            count++;
             t--;
        }
        for(String s : a)
            System.out.println(s);
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