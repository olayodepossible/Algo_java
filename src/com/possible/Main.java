package com.possible;

import com.possible.array.*;
import com.possible.coding.*;

import java.util.Arrays;
import java.util.logging.Logger;

public class Main {

    private static final Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        int [] A =  { 12, 11, 13, 5, 6, 7 };
        int[] arr = {1,2,3};
        int k = 3;

        int [] b = {-1,0,3,5,9,12};
       int t = 9;

       int[] nums = {12,345,2,6,7896};
       int[] duplicateZero = {1,0,2,3,0,4,5,0};





//        Output: [1,2,3,6,9,8,7,4,5]


        /*
          **** TEST CASES *****
             String num = "1101101";
             String reverse = "123";

             int base2 = 2;
             int base8 = 8;
             int [] A = {1,7,3,6,5,6};
             int [] [] arr = {{1,2,3},{4,5,6},{7,8,9}};

                String[] Test = {"codility1", "codility3", "codility2", "codility4b", "codility4a"};
                String[] result = {"Wrong answer", "OK", "OK", "Runtime error", "OK"};

         */



        /*
         log.info( BaseToBaseConversion.base2To8(num, base8, base2));
         log.info("Ans1 ==> " + StringReversal.stringReversal(reverse));
         log.info("splitNumAns ==> "+ Arrays.toString(SplitNumber.solution2(200)));
         log.info("pivot Array solution ==> "+ PivotIndex.pivotIndex(A));
         log.info("NumberTwiceOfOthers solution ==> "+ NumberTwiceOfOthers.dominantIndex(A));
         log.info("Plus-One solution ==> "+ Arrays.toString(PlusOne.plusOneSolution(new int[]{9})));
         log.info("DiagonalTraverse solution ==> "+ Arrays.toString(DiagonalTraverse.findDiagonalOrder(arr)));
         log.info("SpiralOrder solution ==> "+ SpiralOrder.spiralOrder(arr));
         log.info("Ans1 ==> "+ ReduceBinaryToZero.minStepsToReduceBinaryToZero("10"));
         log.info("Ans1 ==> "+ NathanScorePoint.scorePointSolution(Test, result));
         log.info("Ans1 ==> "+ MaxmumConsequtive.numbersWithEvenDigitCountSolution(nums));



         PascalTriangle.solution(5);
         log.info("BinarySearch solution ==> "+ BinarySearch.binarySearchKeepIndexOrder(A, 5));
         BubbleSort.bubbleSortSolution(A);
         InsertionSort.insertionSortSolution(A);
         QuickSort.quickSortSolution(A, 0, A.length -1);
         SelectionSort.selectionSortSolution(A);
         */

//        log.info("Ans1 ==> "+ ReduceBinaryToZero.minStepsToReduceBinaryToZero("111"));
//        log.info("Ans1 ==> "+ ReduceBinaryToZero.minStepsToReduceBinaryToZero("011100"));

//        log.info("Ans1 ==> "+ SubArraySum.subArraySumSolution(arr, k));
//        log.info("Ans1 ==> "+ );

        ArrayImpl.duplicateZeros1(duplicateZero);

//        [1,0,0,2,3,0,0,4]

    }

}

