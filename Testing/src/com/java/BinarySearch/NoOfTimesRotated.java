package com.java.BinarySearch;

public class NoOfTimesRotated {
    public static void main(String[] args) {
        int a[] = {11, 14, 17, 19, 2, 5, 6, 9};
        System.out.println(countRotations(a));
    }
    public static int countRotations(int a[]){
        int mid = 0;
        int next = 0;
        int prev = 0;
        int start = 0;
        int end = a.length - 1;
        int n = a.length;
        while(start <= end){
            mid = start + (end - start)/2;
            next = (mid + 1) % n;
            prev = (mid + n - 1) % n;
            if(a[mid] <= a[prev] && a[mid] <= a[next]){
                return mid;
            }
            else if(a[end] >= a[mid]){
                end = mid - 1;
            }
            else if(a[start] <= a[mid]){
                start = mid + 1;
            }
        }
        return -1;
    }
}
