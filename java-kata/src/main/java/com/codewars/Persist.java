package com.codewars;

public class Persist {
    public static int persistence(long n) {
        int res = 0;
        while (n >= 10) {
            res++;
            n = Long.toString(n).chars()
                    .map(Character::getNumericValue)
                    .mapToLong(it -> it)
                    .reduce(1L, (m, i) -> m * i);
        }
        return res;
    }
}
