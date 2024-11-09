package com.leetcode;

/**
 * <h3><a href="https://leetcode.com/problems/roman-to-integer/description/">Roman to Integer</a></h3>
 * 
 * <p>
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * </p>
 * <pre>
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * </pre>
 * <p>
 * For example, 2 is written as II in Roman numeral, just two one's added together.
 * 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
 * </p>
 * <p>
 * Roman numerals are usually written largest to smallest from left to right.
 * However, the numeral for four is not IIII. Instead, the number four is written as IV.
 * Because the one is before the five we subtract it making four.
 * The same principle applies to the number nine, which is written as IX.
 * There are six instances where subtraction is used:
 *     <ul>
 *         <li>I can be placed before V (5) and X (10) to make 4 and 9</li>
 *         <li>X can be placed before L (50) and C (100) to make 40 and 90</li>
 *         <li>C can be placed before D (500) and M (1000) to make 400 and 900</li>
 *     </ul>
 * </p>
 * <p>Given a roman numeral, convert it to an integer.</p>
 * <p>
 *     <h6>Constraints:</h6>
 *     <ul>
 *         <li><code>1 <= s.length <= 15</code></li>
 *         <li><code>s</code> contains only the characters <code>('I', 'V', 'X', 'L', 'C', 'D', 'M')</code></li>
 *         <li>It is guaranteed that <code>s</code> is a valid roman numeral in the range <code>[1, 3999]</code></li>
 *     </ul>
 * </p>
 */
public class RomanToInteger {
    public int romanToInt(String s) {
        var res = 0;
        char[] chars = s.toCharArray();
        int lastVal = 1;
        for (int i = chars.length-1; i >= 0; i--) {
            var val = switch (chars[i]) {
                case 'I' -> 1;
                case 'V' -> 5;
                case 'X' -> 10;
                case 'L' -> 50;
                case 'C' -> 100;
                case 'D' -> 500;
                case 'M' -> 1000;
                default -> 0;
            };

            if (lastVal > val) {
                res -= val;
            } else {
                res += val;
                lastVal = val;
            }
        }
        return res;
    }
}
