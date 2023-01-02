package com.possible.coding;

public class CapFirstLetter {
    public static String capitalizeString(String data){
        String [] splitedString = data.split(" ");

        for(int i = 0; i < splitedString.length; i++){
            String cap = splitedString[i].substring(0, 1).toUpperCase() + splitedString[i].substring(1);
            splitedString[i] = cap;
        }
        return String.join(" ", splitedString);
    }
}
