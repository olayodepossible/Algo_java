package com.possible.coding;

import java.util.Arrays;

public class AnagramCode {

    public static boolean isAnagram(String data1, String data2){
        if(data1.length() != data2.length()) return false;
        String data1LoweCasse = data1.toLowerCase();
        String data2LoweCasse = data1.toLowerCase();
        char[] firstChar = data1LoweCasse.toCharArray();
        char[] secondChar = data2LoweCasse.toCharArray();
        Arrays.sort(firstChar);
        Arrays.sort(secondChar);
//        for (int i = 0; i < firstChar.length; i++) {
//            if (firstChar[i] == secondChar[i]) continue;
//            else return false;
//        }
        return Arrays.equals(firstChar,secondChar);
    }
}
