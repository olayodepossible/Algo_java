package com.possible.coding;

public class NumberTwiceOfOthers {

    public static int dominantIndex(int[] nums) {
        if(nums.length == 1) return 0;

        int max = 0;

        for(int i = 0; i < nums.length; i++ ){
            if(max < nums[i]) max = nums[i];
        }

        for(int i = 0; i < nums.length; i++ ){
            if(max == nums[i] && max < 2 * nums[i]) return i;
        }

        return -1;

    }

    public static int dominantIndex2(int[] nums) {
        int ans = 0;
        int max = 0;
        int secondMax = 0;

        for (int i = 0; i < nums.length; ++i){
            if (nums[i] > max) {
                secondMax = max;
                max = nums[i];
                ans = i;
            } else if (nums[i] > secondMax) {
                secondMax = nums[i];
            }
        }

        return max >= 2 * secondMax ? ans : -1;

    }
}
