package com.codewars;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class StripComments {

    public static String stripComments(String text, String[] commentSymbols) {
        return text.lines()
                .map(it -> doStrip(it, commentSymbols))
                .collect(Collectors.joining("\n"));
    }

    private static String doStrip(String str, String[] commentSymbols) {
        OptionalInt index = Arrays.stream(commentSymbols)
                .mapToInt(str::indexOf)
                .filter(it -> it >= 0)
                .min();
        return index.isPresent() ? str.substring(0, index.getAsInt()).replaceAll("\\s+$", "") : str;
    }

}
