package com.possible.coding;

public class InPlaceReplacement {

    public static int[] replaceElements(int[] arr) {


        int max =-1;
        for(int i = arr.length-1; i >= 0; ){
            int val = arr[i];
            arr[i--] = max;
            max = Math.max(max, val);
        }
        return arr;

    }

    public static int[] replaceElements2(int[] arr) {
        int j = arr.length - 1;
        int max = -1;

        while(j >= 0){
            int val = arr[j];
            arr[j--] = max;
            max = Math.max(val, max);
        }
        return arr;
    }
}
