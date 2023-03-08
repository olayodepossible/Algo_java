package com.possible.coding;

public class SetBitAlgo {

    public static int setBit(int x){
        int bit = 0;
        while (x > 0){
            x = x & (x-1);
            bit++;
        }
        return bit;
    }
}
