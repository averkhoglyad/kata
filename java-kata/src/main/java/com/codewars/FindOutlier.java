package com.codewars;

import java.util.Arrays;
import java.util.function.IntPredicate;

public class FindOutlier {
    
    static int find(int[] integers) {
        if (integers == null || integers.length < 3) {
            throw new IllegalArgumentException();
        }
        IntPredicate predicate = detectTargetPredicate(integers);
        return Arrays.stream(integers)
                .filter(predicate)
                .findFirst()
                .getAsInt();
    }

    private static IntPredicate detectTargetPredicate(int[] arr) {
        int sum = Arrays.stream(arr)
                .limit(3)
                .map(it -> it % 2 == 0 ? 1 : -1)
                .sum();
        if (sum > 0) { // More even nums, looking for odd one
            return FindOutlier::isOdd;
        } else {
            return FindOutlier::isEven;
        }
    }

    private static boolean isEven(int i) {
        return i % 2 == 0;
    }

    private static boolean isOdd(int i) {
        return i % 2 != 0;
    }
}