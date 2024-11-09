package com.codewars;

import java.util.Arrays;
import java.util.Map;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class FindOdd {
    public static int findIt(int[] a) {
        return Arrays.stream(a)
                .boxed()
                .collect(groupingBy(identity(), counting()))
                .entrySet()
                .stream()
                .filter(it -> it.getValue() % 2 != 0)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();
    }
}
