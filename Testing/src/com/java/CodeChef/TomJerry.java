package com.java.CodeChef;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TomJerry {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int rt, ct, rj, cj, k, dist = 0;
        int t = 0;
        try {
            if(br.readLine() == null ){
                return;
            }
            t = Integer.parseInt(br.readLine());

            do {
                rt = Integer.parseInt(br.readLine());
                ct = Integer.parseInt(br.readLine());
                rj = Integer.parseInt(br.readLine());
                cj = Integer.parseInt(br.readLine());
                k = Integer.parseInt(br.readLine());
                dist = Math.abs(cj - ct) + Math.abs(rj - rt);
                if (dist == k || dist + 2 == k || dist + 4 == k) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
                t--;
            } while (t > 0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
