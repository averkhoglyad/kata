package com.leetcode;

/**
 * <h3><a href="https://leetcode.com/problems/string-to-integer-atoi/">String to Integer (atoi)</a></h3>
 *
 * <p>Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer (similar to C/C++'s atoi function).</p>
 *
 * <p>The algorithm for myAtoi(string s) is as follows:</p>
 * <p>
 * Read in and ignore any leading whitespace.
 * Check if the next character (if not already at the end of the string) is '-' or '+'. Read this character in if it is either. This determines if the final result is negative or positive respectively. Assume the result is positive if neither is present.
 * Read in next the characters until the next non-digit character or the end of the input is reached. The rest of the string is ignored.
 * Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). If no digits were read, then the integer is 0. Change the sign as necessary (from step 2).
 * If the integer is out of the 32-bit signed integer range [-2^31, 2^31 - 1], then clamp the integer so that it remains in the range. Specifically, integers less than -2^31 should be clamped to -2^31, and integers greater than 2^31 - 1 should be clamped to 2^31 - 1.
 * Return the integer as the final result.
 * </p>
 *
 * <p>
 * <strong>Note:</strong>
 * <ul>
 *     <li>Only the space character ' ' is considered a whitespace character.</li>
 *     <li>Do not ignore any characters other than the leading whitespace or the rest of the string after the digits.</li>
 * </ul>
 * </p>
 *
 * <p>
 * <h6>Constraints:</h6>
 * <ul>
 *     <li>0 <= s.length <= 200</li>
 *     <li>s consists of English letters (lower-case and upper-case), digits (0-9), ' ', '+', '-', and '.'.</li>
 * </ul>
 * </p>
 */
public class StringToIntegerAtoi {
    public int myAtoi(String s) {
        var res = 0;
        var neg = false;
        var lookingForSign = true;
        var chars = s.toCharArray();
        for (int i = 0, charsLength = chars.length; i < charsLength; i++) {
            char ch = chars[i];
            if (ch >= '0' && ch <= '9') {
                lookingForSign = false;
                if (res > (Integer.MAX_VALUE / 10) || res < (Integer.MIN_VALUE / 10)) {
                    return neg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
                res = res * 10;
                res = res + (ch - '0') * (neg ? -1 : 1);
                if (res != 0 && (neg ^ (res < 0))) {
                    return neg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
                continue;
            }
            if (lookingForSign) {
                if (ch == ' ') {
                    continue;
                }
                lookingForSign = false;
                if (ch == '-') {
                    neg = true;
                    continue;
                }
                if (ch == '+') {
                    continue;
                }
                break;
            }
            break;
        }
        return res;
    }
}
