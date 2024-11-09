package com.leetcode;

/**
 * <h3><a href="https://leetcode.com/problems/add-binary/">Add Binary</a></h3>
 * <p>
 *     Given two binary strings <code>a</code> and <code>b</code>, return their sum as a binary string.
 * </p>
 *
 * <p>
 *     <h6>Constraints:</h6>
 *     <ul>
 *         <li><code>1 <= a.length, b.length <= 10^4</code></li>
 *         <li><code>a</code> and <code>b</code>> consist only of <code>'0'</code> or <code>'1'</code> characters.</li>
 *         <li>Each string does not contain leading zeros except for the zero itself.</li>
 *     </ul>
 * </p>
 */
public class AddBinary {

    public String addBinary(String a, String b) {
        var capacity = Math.max(a.length(), b.length()) + 1;
        var digits = new char[capacity];
        var current = 0;

        for (int i = 1; i <= capacity; i++) {
            current += (i <= a.length() ? a.charAt(a.length() - i) : '0') == '1' ? 1 : 0;
            current += (i <= b.length() ? b.charAt(b.length() - i) : '0') == '1' ? 1 : 0;
            digits[capacity - i] = (char) (current % 2 + '0');
            current /= 2;
        }

        var sb = new StringBuilder(capacity);
        for (int i = 0; i < digits.length; i++) {
            if (i == 0 && digits[i] == '0') {
                continue;
            }
            sb.append(digits[i]);
        }
        return sb.toString();
    }
}
