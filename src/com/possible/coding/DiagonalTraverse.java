package com.possible.coding;

import java.util.*;

public class DiagonalTraverse {

        public static int[] findDiagonalOrder(int[][] matrix) {
            if(matrix == null || matrix.length == 0) return new int[0];

            int N = matrix.length;
            int M = matrix[0].length;
            int[] res = new int[N*M];

            Map<Integer, List<Integer>> dict = new HashMap<>();

            for(int i = 0; i < N; i++){

                for(int j = 0; j < M; j++){
                    int sum = i+j;
                    dict.computeIfAbsent(sum,  key -> new ArrayList<>());
                    dict.get(sum).add(matrix[i][j]);
                }
            }

            int ctr = 0;
            for(Map.Entry<Integer, List<Integer>> entry : dict.entrySet()){

                List<Integer> tempList;
                if(entry.getKey() % 2 == 0){
                    tempList = entry.getValue();
                    Collections.reverse(tempList);
                }
                else{
                    tempList = entry.getValue();
                }
                for (Integer integer : tempList) {
                    res[ctr++] = integer;
                }

            }
            return res;
        }

}
