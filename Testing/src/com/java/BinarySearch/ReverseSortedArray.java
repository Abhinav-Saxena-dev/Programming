package com.java.BinarySearch;

public class ReverseSortedArray {
    public static void main(String[] args) {
        int a[] = {20, 17, 12, 8, 7, 2, 1};
        int n = 21;
        System.out.println(search(a, n));
    }
    public static int search(int a[], int n){
        int start = 0;
        int end = a.length - 1;
        int mid = 0;
        while(start <= end){
            mid = start + (end - start)/2;
            if(a[mid] == n){
                return mid;
            }
            else if(a[mid] < n){
                end = mid - 1;
            }
            else if(a[mid] > n){
                start = mid + 1;
            }
        }
        return -1;
    }
}
