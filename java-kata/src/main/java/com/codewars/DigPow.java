package com.codewars;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntToDoubleFunction;
import java.util.stream.IntStream;

public class DigPow {
    public static long digPow(int n, int p) {
        double sum = intDigits(n).mapToDouble(powFn(p)).sum();
        double ratio = sum / n;
        return ratio % 1 == 0 ? (long) ratio : -1;
    }

    private static IntToDoubleFunction powFn(int p) {
        AtomicInteger pow = new AtomicInteger(p);
        return it -> Math.pow(it, pow.getAndIncrement());
    }

    private static IntStream intDigits(int n) {
        return Integer.toString(n).chars().map(Character::getNumericValue);
    }
}
