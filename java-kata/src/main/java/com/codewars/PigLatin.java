package com.codewars;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PigLatin {
    public static String pigIt(String str) {
        return words(str)
                .map(PigLatin::doPigLatin)
                .collect(Collectors.joining(" "));
    }
    public static String pigIt0(String str) {
        return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
    }

    private static Stream<String> words(String str) {
        return Arrays.stream(str.split(" "));
    }

    private static String doPigLatin(String word) {
        if (word.isEmpty()) {
            return word;
        }
        if (!Character.isAlphabetic(word.charAt(0))) {
            return word;
        }
        return word.substring(1) + word.charAt(0) + "ay";
    }
}
