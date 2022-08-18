package com.possible.coding;

import java.util.List;
import java.util.function.Predicate;

public class SimplifyPatterns {

    public static int totalStrategy(List<Integer> numbers, Predicate<Integer> selector){
//        return numbers.stream().filter(selector).mapToInt(value -> value).sum();
        return numbers.stream().filter(selector).reduce(0, Integer::sum);
    }
}
