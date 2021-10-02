package com.java.CodeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class codeChef1 {
    public static void main(String[] args){
        FastReader sc = new FastReader();
         int t = sc.nextInt();
         while(t > 0){
             int x1= sc.nextInt();
             int x2= sc.nextInt();
             int x3= sc.nextInt();
             int r= sc.nextInt();
             int tr = (int)Math.abs(x2 - x1);
             int tb = (int)Math.abs(x3 - x1);
             int br = (int)Math.abs(x2-x3);
             int sd = 0;
             if(br == 0 || tb == 0){
                 sd = tr - r;
             }
            else if(tb + br == tr){
                 sd = tr - r;
             }
             else if(r - tb > 0 ){
                 sd = tr - (r - tb);
             }
             else if(tr == 0){
                 sd = 0;
             }
             else if(r - br > 0){
                 sd = tr - (r - br);
             }
             else{
                 sd = tr;
             }
             System.out.println(sd > 0 ? sd : 0);
              t--;
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
