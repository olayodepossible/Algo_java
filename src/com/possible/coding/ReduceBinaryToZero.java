package com.possible.coding;

public class ReduceBinaryToZero {
    public static int minStepsToReduceBinaryToZero(String s){
        int steps = 0;
        int carry = 0;
       /* for(int i=s.length()-1;i>=1;i--){
            if(carry == 0) {
                if(s.charAt(i) == '1'){
                    steps+=2;
                    carry = 1;
                }
                else{
                    steps++;
                }
            }
            else{
                if(s.charAt(i) == '0') steps+=2;
                else steps++;
            }
        }*/

        int  intValue = Integer.parseInt(Integer.toString(Integer.parseInt(s, 2), 10));
        while (intValue > 0){
            if (intValue % 2 == 1)
                intValue -= 1;
            else
                intValue /=2;
            steps++;
        }

        return steps;
//        return steps+carry;
    }


}
