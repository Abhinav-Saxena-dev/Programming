package com.java.BinarySearch;

public class FindInNearlySortedArray {
    public static void main(String[] args) {
        int a[] = {10, 13, 30, 25, 40, 42};
        int n = 42;
        int index = findElement(a, n);
        System.out.println(index);
    }
    public static int findElement(int a[], int n){
        int mid = 0;
        int start = 0;
        int end = a.length-1;
        while(start <= end){
            mid = start + (end - start)/2;
            if(a[mid] == n) return mid;
            else if(a[mid + 1] == n && mid <= end) return mid+1;
            else if(a[mid - 1] == n && mid >= start) return mid-1;

            else if(n > a[mid]){
                start = mid + 2;
            }
            else if(n < a[mid]){
                end = mid - 2;
            }
            }
        return -1;
        }
    }

