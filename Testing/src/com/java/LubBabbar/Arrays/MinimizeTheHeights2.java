package com.java.LubBabbar.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinimizeTheHeights2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();

        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int ans = (a[n - 1]) - (a[0]);  // difference of max and min of array before operations.
                                        // To decrease difference we have to increase min and decrease max

        int max = 0;       // No point in considering increase in max value.
        int min = 0;       // No point in considering decrease in min value.

        for (int i = 1; i < n; i++) {
            if (a[i] >= k) {  // We are starting from the point from where we can start decreasing the values.

                max = Math.max(a[i - 1] + k, a[n - 1] - k); // Choti value ko badha karr rahe, here choti value is the one
                                                            // before as array is sorted, and comparing it with our max.

                min = Math.min(a[i] - k, a[0] + k);  // Similarly, here bigger value ko ghata rahe hai and compare karr
                                                     // rahe hai apne minimum ke saath.

                ans = Math.min(ans, max - min); // On every iteration the minimum difference is being found.
                                                // On every index, min and max tried to be determined by comparing the
                                                // new max and min with the last and first index max and min, then the
                                                // difference between them is compared with the existing lowest diff.
            }
        }
        System.out.println(ans);
    }
}
