package com.possible.array;

import java.util.Arrays;

public class MergeSort {

    static void merge(int arr[], int l, int m, int r) {
        // Find sizes of two sub-arrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int [] leftSide = new int[n1];
        int [] rightSide = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            leftSide[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            rightSide[j] = arr[m + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (leftSide[i] <= rightSide[j]) {
                arr[k] = leftSide[i];
                i++;
            }
            else {
                arr[k] = rightSide[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = leftSide[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = rightSide[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()

    public static void mergeSortSolution(int arr[], int l, int r){
        if (l < r) {
            // Find the middle point
            int m = l + (r-l)/2;

            // Sort first and second halves
            mergeSortSolution(arr, l, m);
            mergeSortSolution(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }

    }





}
