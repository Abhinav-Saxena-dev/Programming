package com.java.HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HelpHulk {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        long t = sc.nextInt();
        long lg2 = 0;
        long result = 0;
        while(t > 0){
            int count = 0;
            lg2 = 1;
            long n = sc.nextInt();
            result  = n;
            while(result>0 && lg2 >0) {
                lg2 = (long) (Math.log(result) / Math.log(2));
                result = result - (long) (Math.pow(2, lg2));
                count++;
            }
            System.out.println(count);
            t--;
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
