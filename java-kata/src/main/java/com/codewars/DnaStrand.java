package com.codewars;

import java.util.stream.Collectors;

public class DnaStrand {

    public static String makeComplement(String dna) {
        return dna.chars()
                .mapToObj(DnaStrand::complement)
                .collect(Collectors.joining());
    }

    private static String complement(int ch) {
        return switch (ch) {
            case ('T') -> "A";
            case ('A') -> "T";
            case ('C') -> "G";
            case ('G') -> "C";
            default -> throw new IllegalStateException("Unexpected value: " + ch);
        };
    }
}
