package com.java.CodeForcesA20JLadders;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TPrimes {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int n = sc.nextInt();
        long a[] = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        int count = 0;
        int flag = 0;
        int sqrt = 0;
        while (count < n) {
            flag = 0;
            sqrt = (int)Math.sqrt(a[count]);
            if (a[count] % 2 != 0) {
                for (int i = sqrt; i <= a[count] / 2; i += 2) {
                    if (a[count] % i == 0) {
                        flag++;
                    }
                }
            } else {
                for (int i = sqrt; i <= a[count] / 2; i++) {
                    if (a[count] % i == 0) {
                        flag++;
                    }
                }
            }
            if (flag == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            count++;
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
