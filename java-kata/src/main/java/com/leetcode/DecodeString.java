package com.leetcode;

import java.util.PrimitiveIterator;

/**
 * <h3><a href="https://leetcode.com/problems/decode-string/">Decode String</a></h3>
 * <p>Given an encoded string, return its decoded string.</p>
 * <p>
 *     The encoding rule is: <code>k[encoded_string]</code>, where the <code>encoded_string</code> inside the square brackets
 *     is being repeated exactly <code>k</code> times. Note that <code>k</code> is guaranteed to be a positive integer.
 * </p>
 * <p>
 *     You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-formed, etc.
 *     Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, <code>k</code>.
 *     For example, there will not be input like <code>3a</code> or <code>2[4]</code>.
 * </p>
 * <p>
 *     The test cases are generated so that the length of the output will never exceed <code>10^5</code>.
 * </p>
 * <p>
 *     <h6>Constraints:</h6>
 *     <ul>
 *         <li><code>1 <= s.length <= 30</code></li>
 *         <li><code>s</code> consists of lowercase English letters, digits, and square brackets <code>'[]'</code>.</li>
 *         <li><code>s</code> is guaranteed to be <strong>a valid</strong> input.</li>
 *         <li>All the integers in s are in the range <code>[1, 300]</code>.</li>
 *     </ul>
 * </p>
 */
public class DecodeString {

    public String decodeString(String s) {
        return process(s.chars().iterator()).toString();
    }

    private StringBuilder process(PrimitiveIterator.OfInt iterator) {
        var multiplier = 0;
        var sb = new StringBuilder();
        while (iterator.hasNext()) {
            var ch = (char) iterator.nextInt();
            if (Character.isDigit(ch)) {
                multiplier = multiplier * 10 + ch - '0';
            } else if (ch == '[') {
                multiplier = multiplier > 1 ? multiplier : 1;
                var str = process(iterator);
                for (var i = 0; i < multiplier; i++) {
                    sb.append(str);
                }
                multiplier = 0;
            } else if (ch == ']') {
                break;
            } else {
                sb.append(ch);
                multiplier = 0;
            }
        }
        return sb;
    }
}
