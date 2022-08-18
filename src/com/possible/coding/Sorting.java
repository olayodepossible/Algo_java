package com.possible.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sorting {

    public static void intArr(int[] arr){
        //sort primitives array like int array
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sortStringArray(int[] strArr){
        //sorting String array
        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));
    }

    public static void intArr(List<String> strList){
        //sorting list of objects of Wrapper classes
        Collections.sort(strList);
        for(String str: strList) System.out.print(" "+str);
    }


}
