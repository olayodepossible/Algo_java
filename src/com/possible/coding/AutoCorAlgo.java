/**
package com.possible.coding;

import java.util.Objects;

public class AutoCorAlgo {
    public int levenshteinDistance(String source, String target){
        if(source.length() == 0){
            if(target.length() == 0) return 0;
            return target.length();
        }
        if(target.length() == 0) return source.length();

        if(source.length() > target.length()){
            var temp = target;
            target = source;
            source = temp;
        }

        var m = target.length();
        var n = source.length();
        var distance = new int[2, ++m];

        // Initialize the distance matrix
        for(var j = 1; j <= m; j++){
            distance[0, j] = j;
        }

        var currentRow = 0;
        for(var i = 1; i <= n; ++i){
            currentRow = i & 1;
            distance[currentRow, 0] = i;
            var previousRow = currentRow ^ 1;
            for(var j = 1; j <= m; j++) {
                var cost = (target[j - 1] == source[i - 1] ? 0 : 1);
                distance[currentRow, j] = Math.min(Math.min(
                        distance[previousRow, j] + 1,
                        distance[currentRow, j - 1] + 1),
                distance[previousRow, j - 1] + cost);
            }
        }
        return distance[currentRow, m];
    }
} */
