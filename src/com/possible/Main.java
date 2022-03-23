package com.possible;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String num = "1101101";

        String num8 = "155";
        String reverse = "123";

         int base2 = 2;
         int base8 = 8;
        String ans = base2To8(num8, base8, base2);
//        System.out.println(ans);
        System.out.println("Ans1 ==> " +stringReversal(reverse));
        System.out.println("Ans2 ==> " +stringReversal2(reverse));
    }


    public static String base2To8(String number, int base8, int base2){
        return Integer.toString(Integer.parseInt(number, base8), base2);
    }

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
