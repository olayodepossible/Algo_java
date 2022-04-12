package com.possible.coding;

import java.util.HashMap;
import java.util.Map;

public class NathanScorePoint {

        public static int scorePointSolution(String[] test, String[] result) {
            Map<Integer, Integer> scoreMap = new HashMap<>();
            int testLen = test.length;
            int resultLen = test.length;

            if (resultLen != testLen) return 0;

            int[] stripped = new int[testLen];

            //separate the String from numbers...
            for (int i = 0; i < test.length; i++) {
                stripped[i] = Integer.parseInt(test[i].replaceAll("[^0-9]", ""));
            }

            //working with just the numbers from the test groups array
            for (int i = 0; i < stripped.length; i++) {

                if (result[i].equals("OK"))
                    scoreMap.putIfAbsent(stripped[i], 100);
                else
                    scoreMap.putIfAbsent(stripped[i], 0);
            }

            int correctAnswers = 0;
            for (int val : scoreMap.values()) {
                if (val == 100)
                    correctAnswers++;
            }

            double avg =  correctAnswers * (100/ (double) scoreMap.size());

            return (int) Math.floor(avg);

        }
}
