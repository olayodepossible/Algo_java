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


        System.out.println( Arrays.toString(newArr));
    }


    // ========================= MergeSort ===================================
    // nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3

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

    public static boolean increasingOrderOfKeyCodilitySolution(int[] A, int K) {
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

    public static int removeElement(int[] nums, int val) {
        if(nums.length==1 && nums[0]!=val)
            return 1;
        if(nums.length == 1)
            return 0;

        int k = 0;
        for(int i = 0; i<nums.length; i++) {
            if(nums[i] != val) {
                nums[k++] = nums[i];
            }
        }

        return k;

    }


    public static int removeDuplicates(int[] nums) {
        int k = 0;
        for(int i = 0; i <= nums.length; i++){
            if (i+1 == nums.length ){
                nums[k++] = nums[i];
                break;
            }

            else if(nums[i] != nums[i+1]){
                nums[k++] = nums[i];
            }
        }
        System.out.println(Arrays.toString(nums) + k);
        return k;

    }

    public static int removeDuplicatesSolution2(int[] nums) {
        int lastIdx =0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[lastIdx]){
                nums[++lastIdx]=nums[i];
            }
        }
        return lastIdx+1;
    }

}
