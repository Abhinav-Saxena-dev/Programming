package com.java.gfg;

import java.io.*;
import java.util.*;

public class spiralArrayPrint {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int r = sc.nextInt();
        int c = sc.nextInt();
        int a[][] = new int[r][c];
        for(int i=0 ; i< a.length ; i++){
            for( int j=0; j<a[i].length; j++)
                a[i][j]= sc.nextInt();
        }
        System.out.println(spirallyTraverse(r,c,a));

    }
    public static List<Integer> spirallyTraverse(int r, int c, int arr[][])
    {
        List<Integer> li = new ArrayList<Integer>();
        int a=0;
        int b=0;
        while(a < r && b < c){
            for(int i=b; i<c ; i++){
                li.add(arr[a][i]);
            }
            a++;
            for(int i=a; i<r ; i++){
                li.add(arr[i][c-1]);
            }
            c--;
            if(a < r){
                for(int i = c-1; i>=b; i--){
                    li.add(arr[r-1][i]);
                }
                r--;
            }
            if(b < c){
                for(int i = r-1; i>=a; i--){
                    li.add(arr[i][b]);
                }
                b++;
            }
        }
        return li;
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
