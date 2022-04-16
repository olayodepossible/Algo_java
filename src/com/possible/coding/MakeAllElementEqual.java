package com.possible.coding;

import java.util.Arrays;

public class MakeAllElementEqual {

    public static int minimumStepToMakeAllElementEqual(int[] A) {
        Arrays.sort(A);
        int len = A.length;

        int mid = A[len/2];
        int midTwo = A[(len/2) - 1];
        int diff = 0;
        int diffTwo = 0;

        for (int j : A) {
            diff = diff + Math.abs(j - mid);
            diffTwo = diffTwo + Math.abs(j - midTwo);
        }
//        for(int i=0; i<A.length; i++) {
//            diff = diff +  Math.abs(A[i] - mid);
//            diffTwo = diffTwo + Math.abs(A[i] - midTwo);
//        }
        return Math.min(diff, diffTwo);
    }
}
