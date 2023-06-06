package com.possible;

import com.possible.coding.*;

import java.util.*;
import java.util.logging.Logger;

public class Main {

    private static final Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        String an [] = "http:localhost:8080/api/service/v1/jdf-parser/098886".split("jdf-parser/");
        System.out.println(Arrays.toString(an));

        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i < 100 ; i++) {
            String name = UUID.randomUUID().toString();
            int age = new Random().nextInt(100 - 20) +20;
            double height = new Random().nextDouble() +1.1;
            Student student = new Student(name, age, height);
            studentList.add(student);
        }

//        List<Student> studentListStream = studentList.stream().sorted().collect(Collectors.toList());
        studentList.sort(Student.NameComparator);
//        Collections.sort(studentList);

//        for (Student st: studentList) {
////          log.info(" studentListStream - \n "+ st);
//          log.info(" studentListStream - \n "+ st);
//        }

        if (AnagramCode.isAnagram("Keep", "Peek"))log.info("is Anagram");
        else log.info("is NOT Anagram");




//        int [] A =  { 12, 11, 13, 5, 6, 7 };
//        int[] arr = {1,2,3};
//        int k = 3;
//
//        int [] b = {-1,0,3,5,9,12};
//       int t = 9;
//
//       int[] nums = {12,345,2,6,7896};
//       int[] duplicateZero = {1,0,2,3,0,4,5,0};
//
//       int [] numMerge1 =  {4,5,6,0,0,0}; int m = 3;
//       int[] nums2 = {1,2,3}; int n = 3;





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

         log.info("Ans1 ==> "+ ReduceBinaryToZero.minStepsToReduceBinaryToZero("10"));
         log.info("Ans1 ==> "+ NathanScorePoint.scorePointSolution(Test, result));
         log.info("Ans1 ==> "+ MaxmumConsequtive.numbersWithEvenDigitCountSolution(nums));
         log.info("CastleCount solution ==> "+ CastleCount.findCastleCountCodility3(new int[]{2, 2, 3, 4, 3, 3, 2, 2, 1, 1, 2, 5}));
         log.info("Ans1 ==> "+ SubArraySum.subArraySumSolution(arr, k));
         log.info("SpiralOrder solution ==> "+ Arrays.toString(SpiralOrder.spiralCopy(
                new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}})));
        log.info("Ans1 ==> "+ MakeAllElementEqual.minimumStepToMakeAllElementEqual(new int[]{3, 2, 1, 1, 2, 3, 1}));
        log.info("Ans1 ==> "+ ReduceBinaryToZero.minStepsToReduceBinaryToZero("011100"));
        log.info("Ans1 ==> "+ InPlaceReplacement.replaceElements(new int[]{17,18,5,4,6,1}));




        ArrayImpl.mergeSortNumSolution(numMerge1, m, nums2, n);
        ArrayImpl.removeDuplicatesSolution3(new int[]{ 1,1,2});
        ArrayImpl.removeDuplicatesSolution2(new int[]{ 0,0,1,1,1,2,2,3,3,4});
         PascalTriangle.solution(5);
         log.info("BinarySearch solution ==> "+ BinarySearch.binarySearchKeepIndexOrder(A, 5));
         BubbleSort.bubbleSortSolution(A);
         InsertionSort.insertionSortSolution(A);
         QuickSort.quickSortSolution(A, 0, A.length -1);
         SelectionSort.selectionSortSolution(A);
         */


//        ArrayImpl.cout(new String[]{"a", "b", "a"});

//        log.info("Ans1 ==> "+ ArrayImpl.wordCount(new String[]{"a", "b", "a"}));

//        Write a program to confirm if a string is an analgram


        /*
            System.out.println(ReverseMaintainPosition.reverseLetters("z<*zj")); //j<*zz
            System.out.println(SetBitAlgo.setBit(5));

        **/


    }

}

