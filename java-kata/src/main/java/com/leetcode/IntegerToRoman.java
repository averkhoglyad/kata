package com.leetcode;

/**
 * <h3><a href="https://leetcode.com/problems/integer-to-roman/">Integer to Roman</a></h3>
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
 * <p>Given an integer, convert it to a roman numeral.</p>
 * <p>
 *     <h6>Constraints:</h6>
 *     <ul>
 *         <li><code>1 <= num <= 3999</code></li>
 *     </ul>
 * </p>
 */
public class IntegerToRoman {
    public String intToRoman(int num) {
        var sb = new StringBuilder();

        if (num >= 1000) {
            for (var i = num / 1000; i > 0; i--) {
                sb.append("M");
            }
            num = num % 1000;
        }

        if (num >= 900) {
            sb.append("CM");
            num -= 900;
        }

        if (num >= 500) {
            sb.append("D");
            num -= 500;
        }

        if (num >= 400) {
            sb.append("CD");
            num -= 400;
        }

        if (num < 400) {
            for (var i = num / 100; i > 0; i--) {
                sb.append("C");
            }
            num = num % 100;
        }

        if (num >= 90) {
            sb.append("XC");
            num -= 90;
        }

        if (num >= 50) {
            sb.append("L");
            num -= 50;
        }
        if (num >= 40) {
            sb.append("XL");
            num -= 40;
        }

        if (num < 40) {
            for (var i = num / 10; i > 0; i--) {
                sb.append("X");
            }
            num = num % 10;
        }

        if (num == 9) {
            sb.append("IX");
            num = 0;
        }

        if (num >= 5) {
            sb.append("V");
            num -= 5;
        }
        if (num == 4) {
            sb.append("IV");
            num = 0;
        }
        if (num < 4) {
            for (var i = num; i > 0; i--) {
                sb.append("I");
            }
        }

        return sb.toString();
    }
}
