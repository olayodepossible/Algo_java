package com.possible;

import com.possible.coding.*;

import java.util.Arrays;
import java.util.logging.Logger;

public class Main {

    private static final Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {


        /*
          **** TEST CASES *****
         String num = "1101101";
         String reverse = "123";

         int base2 = 2;
         int base8 = 8;
         int [] A = {1,7,3,6,5,6};

         */



        /*
         log.info( BaseToBaseConversion.base2To8(num, base8, base2));
         log.info("Ans1 ==> " + StringReversal.stringReversal(reverse));
         log.info("splitNumAns ==> "+ Arrays.toString(SplitNumber.solution2(200)));
         log.info("pivot Array solution ==> "+ PivotIndex.pivotIndex(A));
         log.info("NumberTwiceOfOthers solution ==> "+ NumberTwiceOfOthers.dominantIndex(A));
         */

        log.info("Plus-One solution ==> "+ Arrays.toString(PlusOne.plusOneSolution(new int[]{9})));
    }

}

