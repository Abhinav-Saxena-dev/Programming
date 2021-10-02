package com.java.BinarySearch;

public class FindRotatedArray {
    public static void main(String[] args) {
        int a[] = {11, 13, 17, 19, 2, 5, 6, 9};
        int n = 5;
        int indexMin = findMinimum(a);
        int indexNum = search(a, n, 0, indexMin - 1) > 0 ? search(a, n, 0, indexMin - 1) : search(a, n, indexMin, a.length - 1);
        System.out.println(indexNum);
    }

    public static int findMinimum(int a[]) {
        int mid = 0;
        int next = 0;
        int prev = 0;
        int start = 0;
        int end = a.length - 1;
        int n = a.length;
        while (start <= end) {
            mid = start + (end - start) / 2;
            next = (mid + 1) % n;
            prev = (mid + n - 1) % n;
            if (a[mid] <= a[prev] && a[mid] <= a[next]) {
                return mid;
            } else if (a[mid] <= a[end]) {
                end = mid - 1;
            } else if (a[mid] >= a[start]) {
                start = mid + 1;
            }
        }
        return 0;
    }

    public static int search(int a[], int n, int start, int end) {
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (a[mid] == n) {
                return mid;
            } else if (a[mid] <= n) {
                start = mid + 1;
            } else if (a[mid] >= n) {
                end = mid - 1;
            }
        }
        return -1;
    }
}
