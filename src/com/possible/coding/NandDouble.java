package com.possible.coding;

import java.util.Arrays;

public class NandDouble {

    public static boolean checkIfN_DoubleExist(int[] arr) {
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            if(binarySearch(arr, arr[i]*2, i)){
                return true;
            }
        }
        return false;
    }
    private static boolean binarySearch(int[] nums, int target, int index){
        int start = 0, N =nums.length, end = N-1, mid=0;
        while(start <= end){
            mid = start + (end - start)/2;
            if(nums[mid] == target && mid!=index) {
                return true;
            }else if(target < nums[mid]){
                end = mid-1;
            } else{
                start = mid+1;
            }
        }
        return false;
    }

    public boolean checkIfN_DoubleExist2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if ((searchElement(arr, element / 2, i + 1) && element % 2 == 0) ||
                    (searchElement(arr, element * 2, i + 1))) {
                return true;
            }
        }
        return false;
    }

    public boolean searchElement(int[] arr, int element, int index) {
        for (int i = index; i < arr.length; i++) {
            if (element == arr[i]) {
                return true;
            }
        }
        return false;
    }

}
