package com.possible.coding;

public class ShortestVacation {

    public static int solution(int[] A){
        int len = A.length;
        if (len == 0 || len == 1) return len;

        int beginPoint = 0;
        int stoppingPoint = 0;

        int [] lastVisitedLocation = new int[len];
        lastVisitedLocation[A[0] - 1] = 1;
        for (int i = 1; i < len; i++) {
            int currLocationIndex = A[i] - 1;
            lastVisitedLocation[currLocationIndex]++;

            if (A[i] == A[i-1]) continue;

            stoppingPoint = i;

            while (lastVisitedLocation[A[beginPoint] - 1] > 1){
                lastVisitedLocation[A[beginPoint] -1 ]--;
                beginPoint++;
            }

        }

        return stoppingPoint - beginPoint+1;
    }
}
