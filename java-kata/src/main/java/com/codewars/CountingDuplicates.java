package com.codewars;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        if (text == null || text.length() == 0) {
            return 0;
        }
        return (int) text.codePoints()
                .map(Character::toLowerCase)
                .boxed()
                .collect(groupingBy(identity(), counting()))
                .values()
                .stream()
                .filter(val -> val > 1)
                .count();
    }
}
