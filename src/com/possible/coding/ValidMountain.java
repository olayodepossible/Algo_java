package com.possible.coding;

public class ValidMountain {

    public static boolean validMountainArray(int[] arr) {

        int decreasingVal = 0;

        if(arr.length < 3 || arr[1] <= arr[0] || arr[arr.length - 1] > arr[arr.length - 2]) return false;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] <= arr[i - 1]) {
                decreasingVal = i;
                break;
            }
        }

        for(int j = decreasingVal; j < arr.length; j++) {

            if(arr[j] >= arr[j - 1]) {
                return false;
            }
        }
        return true;

    }

    public static boolean validMountainArray2(int[] A) {
        int N = A.length;
        int i = 0;

        // walk up
        while (i+1 < N && A[i] < A[i+1])
            i++;

        // peak can't be first or last
        if (i == 0 || i == N-1)
            return false;

        // walk down
        while (i+1 < N && A[i] > A[i+1])
            i++;

        return i == N-1;
    }


}
