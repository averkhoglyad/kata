package com.codewars;

import java.util.stream.IntStream;

public class PangramChecker {
    public boolean check(String sentence) {
        sentence = sentence.toLowerCase();
        return IntStream.range('a', 'z')
                .mapToObj(Character::toString)
                .allMatch(sentence::contains);
    }
}
