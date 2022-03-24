package com.possible.coding;

public class BaseToBaseConversion {
    public static String base2To8(String number, int sourceBase, int destinationBase){
        return Integer.toString(Integer.parseInt(number, sourceBase), destinationBase);
    }


}
