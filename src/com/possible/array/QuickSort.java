package com.possible.array;

public class QuickSort {

    // A utility function to swap two elements
    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

   private static int partition(int[] arr, int low, int high){

        // pivot
        int pivot = arr[high];

        // Index of smaller element and
        // indicates the right position
        // of pivot found so far
        int i = (low - 1);

        for(int j = low; j <= high - 1; j++){

            // If current element is smaller than the pivot
            if (arr[j] < pivot){

                // Increment index of smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
   }


    public static void quickSortSolution(int[] arr, int low, int high){
        if (low < high){

            // partitioning index, that indicate pivot elem is at right place in the arr[]
            int partitionIndex = partition(arr, low, high);

            // Separately sort elements before and after partition
            quickSortSolution(arr, low, partitionIndex - 1);
            quickSortSolution(arr, partitionIndex + 1, high);
        }
    }
}
