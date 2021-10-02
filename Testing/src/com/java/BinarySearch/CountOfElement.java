package com.java.BinarySearch;

public class CountOfElement {
    public static void main(String[] args) {
        int a[] = {2, 4, 10, 10, 10, 18, 20};
        int n = 10;
        int first = firstOccurence(a, n);
        int last = lastOccurence(a, n);
        System.out.println(first+ "   " +last);
        int count = last - first + 1;
        System.out.println(count);
    }

    public static int firstOccurence(int a[], int n) {
        int start = 0;
        int end = a.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (a[mid] == n) {
                end = mid - 1;
            } else if (a[mid] < n) {
                start = mid + 1;
            } else if (a[mid] > n) {
                end = mid - 1;
            }
        }
        return mid;
    }

    public static int lastOccurence(int a[], int n) {
        int start = 0;
        int end = a.length - 1;
        int result = 0;
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (a[mid] == n) {
                start = mid + 1;
            } else if (a[mid] < n) {
                start = mid + 1;
            } else if (a[mid] > n) {
                end = mid - 1;
            }
        }
        return mid;
    }
}
