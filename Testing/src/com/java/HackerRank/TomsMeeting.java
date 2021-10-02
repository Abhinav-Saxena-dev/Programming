package com.java.HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TomsMeeting {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int n = sc.nextInt();
        long a[] = new long[n];
        long csum = 0;
        long max = 0;
        for(int i =0 ;i< n; i++){
            a[i]= sc.nextLong();
        }
        for(int i =0; i<n; i++){
            for(int j = n-1; j>=0;j--){
                csum = 0;
                for (int k = i; k<j;k++){
                    csum = csum + a[k];
                }
                if(csum > max) max = csum;
            }

        }
        System.out.println(max > 0 ? "Yes " + max : "No" );
    }
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
