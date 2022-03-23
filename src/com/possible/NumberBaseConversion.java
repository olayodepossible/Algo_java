package com.possible;

public class NumberBaseConversion {
    private String num = "1101101";

    private int base2 = 2;
    private int base8 = 8;


    public String base2To8(String number, int base2, int base8){
        return Integer.toString(Integer.parseInt(number, base2), base8);
    }

}
