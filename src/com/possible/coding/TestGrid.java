package com.possible.coding;

import java.util.*;
import java.lang.*;

public class TestGrid {
    /**
     * Your final solution should be implemented in the method below
     * @param inputs - A List of Strings containing the challenge inputs
     */
    public static String solution (List<String> inputs) {
        System.out.println("here");
        int x = 0;
        int o = 0;
        int invalidB = 0;

        for (String board : inputs ) {
            String [] line = board.split(" ");
            char [][] grid = createGrid(line);
            if(grid == null || !isValidGrid(grid)){
                invalidB++;
                continue;
            }

            int win = checkWinner(grid);
            if(win == 1) x++;
            else if(win == -1) o++;
            else invalidB++;
        }
        /*StringBuilder ans = new StringBuilder();
        ans.append("x: ");
        ans.append(x);
        ans.append("o: ");
        ans.append(o);
        ans.append("invalid: ");
        ans.append(invalidB);*/
        return "x: "+ x + " o: "+ o+" invalid: "+ invalidB;
    }

    public static char [][] createGrid(String[] board){
        int boardSize = board.length;
        char [][] grid = new char [boardSize][boardSize];
        for(int i = 0; i < boardSize; i++){
            if(board[i].length() != boardSize) return null;
            grid[i] = board[i].toCharArray();
        }
        return grid;
    }

    public static boolean isValidGrid(char [][] grid){
        int xCount = 0;
        int oCount = 0;
        for(char [] row : grid){
            for(char cell : row){
                if(cell == 'x') xCount++;
                else if(cell == 'o') oCount++;
                else if(cell != '-') return false;
            }
        }

        return Math.abs(xCount - oCount) <= 1;
    }

    public static boolean isWinning(char[] line, char player){
        for(char c : line){
            if (c != player) return false;
        }
        return true;
    }


    public static int checkWinner(char [][] grid){
        int gridSize = grid.length;

        boolean xWins = false;
        boolean oWins = false;

        for(int i = 0; i < gridSize; i++){
            if(isWinning(grid[i], 'x')) xWins = true;
            if(isWinning(grid[i], 'o')) oWins = true;

            char[] column = new char[gridSize];

            for(int j = 0; j < gridSize; j++){
                column[j] = grid[j][i];

                if(isWinning(column, 'x')) xWins = true;
                if(isWinning(column, 'o')) oWins = true;
            }
        }


        char [] mDiagonal = new char[gridSize];
        char [] aDiagonal = new char[gridSize];

        for(int i = 0; i < gridSize; i++){
            mDiagonal[i] = grid[i][i];
            aDiagonal[i] = grid[i][gridSize-i-1];
        }

        if(isWinning(mDiagonal, 'x')) xWins = true;
        if(isWinning(mDiagonal, 'o')) oWins = true;
        if(isWinning(aDiagonal, 'x')) xWins = true;
        if(isWinning(aDiagonal, 'o')) oWins = true;

        if(xWins && oWins) return 0; // both player cannot win simultaneously
        if(xWins) return 1;
        if(oWins) return -1;

        return 0;

    }

    /*
    3x3 xxo oo- oxx
2x2 xo x-
4x4 xoxo xoxo x--- xo--
3x3 xxo ooo oox
3x3 xxx ooo ---
     */

    /////////////////////// Ignore the code below //////////////////////////////////
    public static void main (String[] args) {
        System.out.println("Please type");
//        Scanner sc = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();
//        while (sc.hasNextLine()) {
//            inputs.add(sc.nextLine());
//        }
//        sc.close();
        inputs.add("xxo oo- oxx");
        inputs.add("xo x-");
        inputs.add("xoxo xoxo x--- xo--");
        inputs.add("xxo ooo oox");
        inputs.add("xxx ooo ---");
        System.out.println("Please type2");
        String a = solution(inputs);
        System.out.println(a);
    }
}
