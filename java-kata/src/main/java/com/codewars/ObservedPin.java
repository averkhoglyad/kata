package com.codewars;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class ObservedPin {

    private static final Map<Character, char[]> CANDIDATES = Map.of(
            '0', new char[]{'0', '8'},
            '1', new char[]{'1', '2', '4'},
            '2', new char[]{'2', '1', '3', '5'},
            '3', new char[]{'3', '2', '6'},
            '4', new char[]{'4', '1', '5', '7'},
            '5', new char[]{'5', '2', '4', '6', '8'},
            '6', new char[]{'6', '3', '5', '9'},
            '7', new char[]{'7', '4', '8'},
            '8', new char[]{'8', '5', '7', '9', '0'},
            '9', new char[]{'9', '6', '8'}
    );

    public static List<String> getPINs(String observed) {
        char[][] groups = observed.chars()
                .mapToObj(key -> CANDIDATES.get((char) key))
                .toArray(char[][]::new);
        return pins(groups)
                .collect(Collectors.toList());
    }

    private static Stream<String> pins(char[][] groups) {
        return Stream.generate(generator(groups))
                .takeWhile(Objects::nonNull);
    }

    private static Supplier<String> generator(char[][] groups) {
        var scales = stream(groups).mapToInt(arr -> arr.length).toArray();
        int last = stream(scales).reduce(1, (x, y) -> x * y);
        var inc = new AtomicInteger();
        return () -> {
            int i = inc.getAndIncrement();
            return i < last ? generatePin(groups, scales, i) : null;
        };
    }

    private static String generatePin(char[][] groups, int[] scales, int index) {
        var sb = new StringBuilder();
        for (int j = 0; j < groups.length; j++) {
            char[] group = groups[j];
            char ch = group[index % scales[j]];
            index /= scales[j];
            sb.append(ch);
        }
        return sb.toString();
    }
}
