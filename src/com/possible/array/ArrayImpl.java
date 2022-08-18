package com.possible.array;

import java.util.*;

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


    public static int removeDuplicatesSolution2(int[] nums) {
        int lastIdx =1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[lastIdx]){
                nums[++lastIdx] = nums[i];

            }
        }
        return lastIdx+1;
    }

    public static int removeDuplicatesSolution3(int[] nums) {
        int left =1;

        for(int right = 1; right < nums.length; right++){
            if(nums[right] != nums[right - 1]){
                nums[left++] = nums[right];
            }
        }
        return left;
    }

    public static void moveZeroSolution(int[] nums) {
        int left = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0) {
                left++;
            } else {
                if(left > 0) {
                    nums[i-left] = nums[i];
                    nums[i] = 0;
                }
            }

        }
    }

    public static Map<String, Integer> wordCount(String[] words) {
        Map<String, Integer> ans = new HashMap<>();
        for (String s:words) {

            if (!ans.containsKey(s)) {  // first time we've seen this string
                ans.put(s, 1);
            }
            else {
                int count = ans.get(s);
                ans.put(s, count + 1);
            }
        }
        return ans;
    }

    public int[] sortArrayByParity(int[] nums) {

        int left = 0;
        for (int i = 0; i < nums.length; i++){
            if( nums[i] % 2 == 0){
                int temp = nums[left];
                nums[left++] = nums[i];
                nums[i] = temp;
            }
        }

        return nums;
    }

}
