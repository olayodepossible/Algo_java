package com.possible.array;

import java.util.Arrays;

public class BinarySearch {

    public static int binarySearch(int [] arr, int target){
        int firstIndex = 0;
        int lastIndex = arr.length -1;
        Arrays.sort(arr);

        while (lastIndex >= firstIndex){
            int mid = (firstIndex + lastIndex)/2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) firstIndex = mid + 1;
            else lastIndex = mid -1;

        }
         return  -1;
    }

/*
        public static int search(int[] nums, int target) {

            if(nums==null||nums.length == 0)return -1;

            int left=0;
            int right=nums.length - 1;
            while(left<=right){

                int mid=left+(right - left)/2;
                if(target>nums[mid])left=mid+1;
                if(target< nums[mid])right=mid-1;
                if(target==nums[mid])return mid;
            }
            return -1;
        }
*/


    public static int recursiveBinarySearch(int arr[], int left, int right, int x){
        if (right >= left){
            int mid = left + (right - left)/2;
            if (arr[mid] == x) return mid;

            if (arr[mid] > x) return recursiveBinarySearch(arr, left, mid-1, x);

            return recursiveBinarySearch(arr, mid+1, right, x);
        }
        return -1;
    }

    public static int binarySearchKeepIndexOrder(int [] arr, int target){
        int[] copiedArr = Arrays.stream(arr).toArray();
        Arrays.sort(copiedArr);
        int firstIndex = 0;
        int lastIndex = arr.length -1;
//        boolean isPresent = false;


        while (lastIndex >= firstIndex){
            int mid = (firstIndex + lastIndex)/2;
            if (copiedArr[mid] == target){
                for(int i = 0; i < arr.length; i++){
                    if (arr[i] == target) return i;
                }
//                isPresent = true;
                break;
            }
            else if (copiedArr[mid] < target) firstIndex = mid + 1;

            else lastIndex = mid - 1;

        }

       /* if (isPresent){
            for(int i = 0; i < arr.length; i++){
                if (arr[i] == target) return i;
            }
        }

        */


        return  -1;
    }
}
