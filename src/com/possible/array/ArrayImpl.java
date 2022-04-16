package com.possible.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayImpl {


    public static void duplicateZeros1(int [] arr){
        int len = arr.length;
        int [] newArr = new int[len];

        // Copy Elements into new list, except copy 0 twice
        for (int i = 0, j = 0; j < len && i < len; i++, j++) {

            if (arr[i] == 0) {
                newArr[j++] = arr[i];
            }

            //  j is out of array range
            if (j >= len) break;
            newArr[j] = arr[i];
        }

//        arr = newArr;

        System.out.println( Arrays.toString(newArr));
    }


    // ========================= MergeSort ===================================
    // nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3

    public static void mergeSortNums(int[] nums1, int m, int[] nums2, int n) {

        for (int i = m; i < nums1.length; i++) {
            nums1[i] = nums2[i-m];
        }

        for (int i = 0, j= nums1.length-1; i < nums1.length; i++, j--) {

            if (nums1[i] > nums1[j]){
                int temp = nums1[i];
                nums1[i] = nums1[j];
                nums1[j] = temp;
            }
        }


        System.out.println(Arrays.toString(nums1));

    }

    public static void mergeSortNumSolution(int[] nums1, int m, int[] nums2, int n) {

        int i = m-1;  // to avoid outBound exception
        int j = n-1;
        int k = m+n-1;

        while( i >= 0 && j >= 0){
            nums1[k--] = nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
        }
        while(j >= 0){
            nums1[k--] = nums2[j--];
        }


        System.out.println(Arrays.toString(nums1));

    }

    public static boolean solutionCodility(int[] A, int K) {
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            if (A[i] + 1 < A[i + 1])
                return false;
        }
        if (A[0] != 1 || A[n - 1] != K)
            return false;
        else
            return true;
    }



}
