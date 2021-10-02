package com.java.Random;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class ExamsValera {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        TreeMap<Long, Long> tm = new TreeMap<Long, Long>();
        int n = sc.nextInt();
        for(int i = 0; i < n ; i++){
            tm.put(sc.nextLong(), sc.nextLong());
        }
        long min = -1;
        long sch = 0;
        long earl;
        long schb;
        int count= 0;
        for (Map.Entry entry : tm.entrySet()){
            schb = (long) entry.getKey();
            if(schb == sch){
                count++;
            }
            sch = (long) entry.getKey();
            earl = (long) entry.getValue();
            if( min <= earl){
                min = earl;
            }
            else{
                min = sch;
            }
        }
        if(count == tm.size()-1 && count > 1){
            System.out.println(1);
            return;
        }
        System.out.println(min);
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
