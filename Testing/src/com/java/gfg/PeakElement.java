package com.java.gfg;

public class PeakElement {
    public static void main(String[] args) {
        int a[] = {1, 17, 16 , 6, 90, 4};
        int index = peakElement(a, a.length);
        System.out.println(index);
    }
    public static int peakElement(int[] a,int n)
    {
        int mid = 0;
        int start = 0;
        int end = n - 1;
        while(start <= end){
            mid = start + (end - start)/2;
            if((mid != 0 && a[mid] >= a[mid - 1]) && (mid != end && a[mid] >= a[mid + 1])){
                return mid;
            }
            else if(mid == 0 && a[mid] >= a[mid+1]){
                return mid;
            }
            else if(mid == end && a[mid] >= a[mid-1]){
                return mid;
            }
            else if(a[mid + 1] >= a[mid]){
                start = mid + 1;
            }
            else if(a[mid - 1] >= a[mid]){
                end = mid - 1;
            }
        }
        return 0;
    }
}
