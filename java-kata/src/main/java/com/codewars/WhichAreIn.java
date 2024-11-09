package com.codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

public class WhichAreIn {
    public static String[] inArray(String[] array1, String[] array2) {
        var patternString = String.join(",", array2);
        return Arrays.stream(array1)
                .distinct()
                .sorted()
                .filter(patternString::contains)
                .toArray(String[]::new);
    }
}
