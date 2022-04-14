package com.possible.array;

import java.util.Arrays;

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
}
