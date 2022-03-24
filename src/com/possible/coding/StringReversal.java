package com.possible.coding;

public class StringReversal {

    public static String stringReversal(String data){
        char d;
        String newData = "";

        for (int i =0; i < data.length(); i++) {
            d=  data.charAt(i);
            newData = d+newData;
        }

        return newData;
    }

    public static String stringReversal2(String data){
        char d;
        StringBuilder newData = new StringBuilder();

        for (int i =0; i < data.length(); i++) {
            d=  data.charAt(i);
            newData.insert(0, d);

        }

        return newData.toString();
    }
}
