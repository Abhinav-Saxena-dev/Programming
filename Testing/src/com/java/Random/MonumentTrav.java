package com.java.Random;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MonumentTrav {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int row = sc.nextInt();
        int col = sc.nextInt();
        int a[][] = new int[row][col];
        for( int i =0; i<row;i++ ){
            for( int j =0; j<col;j++ ){
               a[i][j]= sc.nextInt();
            }
        }
        int c = 0;
        int i = 0;
        int j =0;
        while(c < col ){
            c++;
              while(i < row && j < col ){
                  System.out.print(a[i][j] + " ");
                  i++;
                  j++;
              }
              i = 0;
              j = c;
        }
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
