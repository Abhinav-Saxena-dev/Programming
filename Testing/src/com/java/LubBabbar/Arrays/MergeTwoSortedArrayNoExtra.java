package com.java.LubBabbar.Arrays;

public class MergeTwoSortedArrayNoExtra {
    static void merge(int arr1[], int arr2[], int n, int m)
    {
        int i = 0;
        int j = 0;
        while (i < n && j < m)
        {
            if (arr1[i] <= arr2[j]) {
                i++;
            }
            else if (arr1[i] > arr2[j])
            {
                int t = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = t;
                i++;
                if (j < m - 1 && arr2[j + 1] < arr2[j]) {
                    int temp = arr2[j];
                    int tempj = j + 1;
                    while (tempj<m && arr2[tempj] < temp && tempj < m) {
                        arr2[tempj - 1] = arr2[tempj];
                        tempj++;
                    }
                    arr2[tempj - 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args)
    {

        int ar1[] = { 1, 5, 9, 10, 15, 20 };
        int ar2[] = { 2, 3, 8, 13 };
        int m = ar1.length;
        int n =ar2.length;
        merge(ar1, ar2, m, n);

        System.out.print("After Merging \nFirst Array: ");
        for (int i = 0; i < m; i++)
            System.out.print(ar1[i]+ " ");
        System.out.print("\nSecond Array: ");
        for (int i = 0; i < n; i++)
            System.out.print(ar2[i]+ " ");
    }
}

