package com.java.CodeChef.JuneCookOff21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TheWave {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int n = sc.nextInt();
        int q = sc.nextInt();
        int a[] = new int[n];
        int prod = 1;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int x;
        int p;
        while (q > 0) {
            x = sc.nextInt();
            p = 1;
            for (int i : a) {
                p = p * (x - i);
            }
            System.out.println(p > 0 ? "POSITIVE" : (p < 0 ? "NEGATIVE" : 0)); // -----
            q--;
        }
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
