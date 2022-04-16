package com.possible.coding;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CastleCount {

    public static int findCastleCountCodility3(int[] A) {
//        [2, 2, 3, 4, 3, 3, 2, 2, 1, 1, 2, 5]

        List<Integer> managed = new ArrayList<>();
        managed.add(A[0]);
        for(int i = 1; i < A.length; i++){
            if(A[i] != A[i-1]) {
                managed.add(A[i]);
            }

        }
        int castles = 1;

        for(int i = 1; i < managed.size()-1; i++){
            if((managed.get(i) > managed.get(i-1) && managed.get(i) > managed.get(i+1))
                    || (managed.get(i) < managed.get(i-1) && managed.get(i) < managed.get(i+1))){
                castles++;
            }
        }

        if(managed.size() > 1 && !Objects.equals(managed.get(managed.size() - 2), managed.get(managed.size() - 1))){
            castles++;
        }

        return castles;
    }
}
