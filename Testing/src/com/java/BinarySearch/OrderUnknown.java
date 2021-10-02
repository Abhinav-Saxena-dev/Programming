package com.java.BinarySearch;

public class OrderUnknown {
    public static void main(String[] args) {
        int a[] = {20, 18, 19, 15, 11, 5, 3, 1};
        int n = 11;
        if(a.length == 1){
            System.out.println(a[0] == n ? 0 : -1);
        }
        else if(a[0] < a[1]){
            System.out.println(ascSearch(a, n));
        }
        else{
            System.out.println(desSearch(a, n));
        }
        }
    public static int ascSearch(int a[], int n){
        int start = 0;
        int end = a.length-1;
        int mid = 0;
        while(start <= end){
            mid = start + (end - start)/2;
            if(a[mid] == n){
                return mid;
            }
            else if(a[mid] < n){
                start = mid + 1;
            }
            else if(a[mid] > n){
                end = mid - 1;
            }
        }
        return -1;
    }
    public static int desSearch(int a[], int n){
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
