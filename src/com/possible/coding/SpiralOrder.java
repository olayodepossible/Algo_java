package com.possible.coding;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        if(matrix == null || matrix.length == 0) return ans;

        int m = matrix.length;
        int n = matrix[0].length;

        int x=0;
        int y=0;

        while(m > 0 && n > 0){

            //if one row/column left, no circle can be formed
            if(m == 1){
                for(int i = 0; i < n; i++){
                    ans.add(matrix[x][y++]);
                }
                break;
            }else if(n == 1){
                for(int i = 0; i < m; i++){
                    ans.add(matrix[x++][y]);
                }
                break;
            }

            //below, process a circle

            //top - move right
            for(int i = 0; i < n-1; i++){
                ans.add(matrix[x][y++]);
            }

            //right - move down
            for(int i = 0; i < m-1; i++){
                ans.add(matrix[x++][y]);
            }

            //bottom - move left
            for(int i = 0; i < n-1; i++){
                ans.add(matrix[x][y--]);
            }

            //left - move up
            for(int i = 0; i < m-1; i++){
                ans.add(matrix[x--][y]);
            }

            x++;
            y++;
            m = m-2;
            n = n-2;
        }
//
//[[1,2,3,4,5],[6,7,8,9,10],[11,12,13,14,15],[16,17,18,19,20]]
        return ans;
    }

    public static int[] spiralCopy(int[][] inputMatrix) {

        if(inputMatrix == null || inputMatrix.length == 0) return new int[]{0};

        int m = inputMatrix.length;
        int n = inputMatrix[0].length;
        int idx = 0;
        int []result = new int[m*n];

        int topRow = 0;
        int btmRow = m - 1;
        int leftCol = 0;
        int rightCol = n -1;

        while(topRow <= btmRow && leftCol <= rightCol){

            for(int i = leftCol; i <= rightCol; i++){
                result[idx] = inputMatrix[topRow][i];
                idx++;
            }
            topRow++;

            for(int i = topRow; i <= btmRow; i++){
                result[idx] = inputMatrix[i][rightCol];
                idx++;
            }
            rightCol--;

            if(topRow <= btmRow){
                for(int i = rightCol; i >= leftCol; i--){
                    result[idx] = inputMatrix[btmRow][i];
                    idx++;
                }
                btmRow--;
            }

            if(leftCol <= rightCol){
                for(int i = btmRow; i >= topRow; i--){
                    result[idx] = inputMatrix[i][leftCol];
                    idx++;
                }
                leftCol++;
            }

        }
        return result;

//        return arrList.stream().mapToInt(Integer::intValue).toArray();
    }


}
