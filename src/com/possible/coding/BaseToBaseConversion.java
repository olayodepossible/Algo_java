package com.possible.coding;

public class BaseToBaseConversion {
    public static String baseConversion(String number, int sourceBase, int destinationBase){
        return Integer.toString(Integer.parseInt(number, sourceBase), destinationBase);
    }


}
