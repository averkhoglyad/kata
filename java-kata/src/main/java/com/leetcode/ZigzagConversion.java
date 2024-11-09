package com.leetcode;

/**
 * <h3><a href="https://leetcode.com/problems/zigzag-conversion/">Zigzag Conversion</a></h3>
 *
 * <p>
 *     The string <code>"PAYPALISHIRING"</code> is written in a zigzag pattern on a given number of rows like this:
 *     <pre>
 *         P   A   H   N
 *         A P L S I I G
 *         Y   I   R
 *     </pre>
 *     And then read line by line: "PAHNAPLSIIGYIR".
 * </p>
 * <p>
 *     Write the code that will take a string and make this conversion given a number of rows
 * </p>
 * <p>
 *     <h6>Constraints:</h6>
 *     <ul>
 *         <li><code>1 <= s.length <= 1000</code></li>
 *         <li><code>s</code> consists of English letters (lower-case and upper-case), <code>','</code> and <code>'.'</code>.</li>
 *         <li><code>1 <= numRows <= 1000</code></li>
 *     </ul>
 * </p>
 */
public class ZigzagConversion {
    public String convert(String s, int numRows) {
        int length = s.length();
        if (length <= numRows || numRows == 1) {
            return s;
        }
        var sb = new StringBuilder();

        var k = 2 * (numRows - 1);
        for (int i = 0; i < length; i += k) {
            sb.append(s.charAt(i));
        }
        for (int j = 1; j < numRows - 1; j++) {
            for (int i = j; i < length; i += k ) {
                sb.append(s.charAt(i));
                if (i + 2 * (numRows - j - 1) < length) {
                    sb.append(s.charAt(i + 2 * (numRows - j - 1)));
                }
            }
        }
        for (int i = numRows - 1; i < length; i += k) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
