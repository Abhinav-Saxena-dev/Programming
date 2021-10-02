package com.java.gfg;

public class SearchInMatri {
    public static void main(String[] args) {
        int n = 2;
        int a[][] = new int[n][n];
    }

    public static void search(int arr[][], int l, int n) {
        if (n == 0 || n < arr[0][0] || n > arr[n - 1][n - 1]) {
            System.out.println("Not Found");
        }
        int a = 0, b = n - 1;
        while(a < n && b >= 0){
            if(arr[a][b] == n){
                System.out.println(a + " " + b);
            }
            else if(arr[a][b] > n){
                b--;
            }
            else {
                a++;
            }
        }
    }
}

