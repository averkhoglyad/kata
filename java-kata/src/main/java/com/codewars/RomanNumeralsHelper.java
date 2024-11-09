package com.codewars;

/**
 * <h3><a href="https://www.codewars.com/kata/51b66044bce5799a7f000003">Roman Numerals Helper</a></h3>
 *
 * <p>
 *     Write two functions that convert a roman numeral to and from an integer value.
 *     Multiple roman numeral values will be tested for each function.
 * </p>
 * <p>
 *     Modern Roman numerals are written by expressing each digit separately starting with the left most digit and
 *     skipping any digit with a value of zero. In Roman numerals <code>1990</code> is rendered:
 *     <code>1000=M</code>, <code>900=CM</code>, <code>90=XC</code>; resulting in <code>MCMXC</code>.
 *     <code>2008</code> is written as <code>2000=MM</code>, <code>8=VIII</code>; or <code>MMVIII</code>.
 *     <code>1666</code> uses each Roman symbol in descending order: <code>MDCLXVI</code>.
 * </p>
 * <p>
 *     In this kata <code>4</code> should be represented as <code>IV</code>,
 *     <strong>NOT</strong> as <code>IIII</code> (the "watchmaker's four").
 * </p>
 * <p>
 *     <h6>Constraints:</h6>
 *     <ul>
 *         <li>Input range: <code>1 <= n < 4000</code></li>
 *     </ul>
 * </p>
 * <p>
 *     Help
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
 * </p>
 */
public class RomanNumeralsHelper {
    public static String toRoman(int num) {
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

    public static int fromRoman(String romanNumeral) {
        var res = 0;
        char[] chars = romanNumeral.toCharArray();
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
