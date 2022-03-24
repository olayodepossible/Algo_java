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
}
