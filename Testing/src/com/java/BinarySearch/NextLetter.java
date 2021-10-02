package com.java.BinarySearch;

public class NextLetter {
    public static void main(String[] args) {
        char a[] = {'a','c','f', 'h', 'o'};
        char key = 'h';
        char result = (char)findNext(a, key);
        System.out.println(result);
    }
    public static int findNext(char a[], char k){
        int mid = 0;
        int start = 0;
        int end = a.length-1;
        int result = -1;
        while(start <= end){
            mid = start + (end - start)/2;
            if(a[mid] == k){
                return a[mid];
            }
            else if(k < a[mid]){
                result = a[mid];
                end = mid - 1;
            }
            else if(k > a[mid]){
                start = mid + 1;
            }
        }
        return result;
    }
}
