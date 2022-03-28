package com.possible.array;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSortSolution(int[] arr) {

        System.out.println("Original Array: " + Arrays.toString(arr));
        //apply insertion sort algorithm on the array
        for(int k = 1; k < arr.length-1; k++)   {
            int temp = arr[k];
            int j = k-1;
            while(j >= 0 && temp <= arr[j]){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = temp;
        }
        //print the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

}
