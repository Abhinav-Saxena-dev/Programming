package com.java.BinarySearch;

public class FirstAndLastOccurence {
    public static void main(String[] args) {
        int a[] = {1, 2, 4, 8, 10, 10 ,10, 18, 20};
        int n = 10;
        System.out.println("first occurence is : " +firstOccurence(a, n));
        System.out.println("last occurencce is : " +lastOccurence(a, n));
    }
    public static int firstOccurence(int a[], int n){
        int start = 0;
        int end = a.length - 1;
        int result = -1;
        int mid = 0;
        while(start <= end){
            mid = start + (end - start)/2;
            if(a[mid] == n){
                result = mid;
                end = mid - 1;
            }
            else if(a[mid] < n){
                start = mid + 1;
            }
            else if(a[mid] > n){
                end = end - 1;
            }
        }
        return result;
    }
    public static int lastOccurence(int a[], int n){
        int start = 0;
        int end = a.length - 1;
        int result = -1;
        int mid = 0;
        while(start <= end){
            mid = start + (end - start)/2;
            if(a[mid] == n){
                result = mid;
                start = mid + 1;
            }
            else if(a[mid] < n){
                start = mid + 1;
            }
            else if(a[mid] > n){
                end = end - 1;
            }
        }
        return result;
    }
}
