package com.possible.coding;

import java.util.HashMap;
import java.util.Map;

public class ContiguousArithmeticMean {

    public static int arithmeticMeanSolution(int[] A, int S){
        Map <Integer,Integer> prefixes = new HashMap<>();
        int result = 0;
        int arrLen = A.length;

        int[] P = new int[arrLen + 1];
        int[] Q = new int[arrLen + 1];
        P[0] = 0;
        Q[0] = 0;
        prefixes.put(0, 1);

        for (int i = 1; i < arrLen; i++) {
            P[i] = P[i-1] + A[i-1];
            Q[i] = P[i] - (S*i);

            if (!prefixes.containsKey(Q[i])) {
                prefixes.put(Q[i], 1);
            }
            else {
                Integer temp = prefixes.get(i);
                temp++;
                prefixes.put(Q[i], temp);
            }
        }

        for (Map.Entry<Integer, Integer> entry: prefixes.entrySet() ) {
            int value = entry.getValue();
            result += value * (value-1)/2;
        }
        return result;
    }
}
