package com.codewars;

import java.util.Arrays;

/**
 * <h3><a href="https://www.codewars.com/kata/585d7d5adb20cf33cb000235">Find the unique number</a></h3>
 *
 * <p>
 *     There is an array with some numbers. All numbers are equal except for one. Try to find it!
 * </p>
 * <p>
 *     It’s guaranteed that array contains at least 3 numbers.
 *     The tests contain some very huge arrays, so think about performance.
 * </p>
 */
public class FindUniqueNumber {

    public static double findUniq(double[] arr) {
        final var x = arr[arr[0] == arr[1] ? 0 : 2];
        for (var y : arr) {
            if (y != x) {
                return y;
            }
        }
        throw new RuntimeException("no unique number found");
    }

    public static double findUniq0(double[] arr) {
        Arrays.sort(arr);
        var first = arr[0];
        var second = arr[1];
        var last = arr[arr.length - 1];
        return first == second ? last : first;
    }

}
