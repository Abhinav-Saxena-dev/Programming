package com.java.LubBabbar.Arrays;

import java.util.Scanner;

// DUTCH NATIONAL ALGORITHM.
public class SortArray01And2WithoutAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int low = 0;
        int mid = 0;
        int high = n - 1;
        int temp = 0;
        while (mid <= high) {  //  mid < high will not work.
            if (a[mid] == 0) {
                temp = a[mid];
                a[mid] = a[low];
                a[low] = temp;
                mid++;
                low++;
            } else if (a[mid] == 1) {  // This is necessary. as no mid++ in the if of a[mid] == 2;
                mid++;
            } else if (a[mid] == 2) {
                temp = a[mid];
                a[mid] = a[high];
                a[high] = temp;
                high--;              // we will not mid++ here because we will also check the element that the 2 will be
            }                       // swapped with.
        }
        for (int i : a) {
            System.out.print(i);
        }
    }
}
