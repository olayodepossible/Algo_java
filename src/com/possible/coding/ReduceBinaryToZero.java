package com.possible.coding;

public class ReduceBinaryToZero {
    public static int minStepsToReduceBinaryToZero(String s){
        int steps = 0;

        int  intValue = Integer.parseInt(Integer.toString(Integer.parseInt(s, 2), 10));
        while (intValue > 0){
            if (intValue % 2 == 1)
                intValue -= 1;
            else
                intValue /=2;
            steps++;
        }

        return steps;
    }

//    ==========================================================================

    public static int minStepsToReduceBinaryToZero2(String S){
        String regex = "^0+(?!$)"; // remove leading zeros
        S = S.replaceAll(regex, "");
        int zerosCount = 0;
        int onesCount = 0;

        for(int i = 0; i< S.length(); i++) {
            if (S.charAt(i) == '0')
                zerosCount++;
            else
                onesCount++;
        }

        return zerosCount + (onesCount - 1) * 2 + 1;
    }


}
