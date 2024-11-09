package com.codewars;

import java.util.Arrays;

public class HighestLowestKata {
    public static String highAndLow(String numbers) {
        var statistics = Arrays.stream(numbers.split(" "))
                .mapToInt(Integer::parseInt)
                .summaryStatistics();
        return statistics.getMax() + " " + statistics.getMin();
    }
}
