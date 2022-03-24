package com.possible.coding;

public class PlusOne {

    public static int[] plusOneSolution(int[] digits) {
        int len = digits.length;

        for(int i = len-1; i >= 0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newNumber = new int [len+1];
        newNumber[0] = 1;
        return newNumber;
    }
}
