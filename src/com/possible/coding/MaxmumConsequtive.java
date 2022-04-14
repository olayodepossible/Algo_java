package com.possible.coding;

import java.util.Arrays;

public class MaxmumConsequtive {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] == 1) {
                count ++;
            } else {
                max = Math.max(max, count);
                count = 0;
            }
        }
        return Math.max(max, count);

    }

// --------------------------------------------------------------------------------------
    public static int findNumbersWithEvenDigitCount(int[] nums) {
        int count = 0;

        for (int num : nums) {
            int len = Integer.toString(num).length();
            if (len % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int numbersWithEvenDigitCountSolution(int[] nums) {
        int count = 0;
        for(int val:nums){
            if(dig(val)) count++;
        }
        return count;
    }

    private static boolean dig(int num){
        int temp = num;
        int nod = 0;
        while(temp != 0){
            temp = temp/10;
            nod++;
        }

        return nod % 2 == 0;
    }

//====================================================================================

    public static int[] sortedSquares(int[] nums) {
        int[] newArr = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            newArr[i] = nums[i]*nums[i];
        }
         Arrays.sort(newArr);
        return newArr;
    }

    public static int[] sortedSquaresSolution(int[] nums) {
        int[] sol = new int[nums.length];
        int i=0;
        int j=nums.length-1;

        for (int k=sol.length-1; k>=0; k--){
            if (Math.abs(nums[i]) > Math.abs(nums[j])){
                sol[k] = nums[i] * nums[i];
                i++;
            }else {
                sol[k] = nums[j] * nums[j];
                j--;
            }
        }
        return sol;
    }

}
