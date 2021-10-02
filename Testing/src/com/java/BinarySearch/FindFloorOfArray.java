package com.java.BinarySearch;

public class FindFloorOfArray {
    public static void main(String[] args) {
        int a[] = {1, 2 ,4, 5, 10, 12, 18, 20, 23};
        int floor = 9;
        int index = findFloor(a, floor);
        System.out.println(index);
    }
    public static int findFloor(int a[], int n){
        int mid = 0;
        int start = 0;
        int end = a.length-1;
        int result = -1;
        while(start <= end){
            mid = start + (end - start)/2;
            if(a[mid] == n) return mid; // floor of a number is also the number itself.
            else if(n > a[mid]){
                result = mid;
                start =  mid + 1;
            }
            else if(n < a[mid]) end = mid - 1;
        }
        return result;
    }
}
