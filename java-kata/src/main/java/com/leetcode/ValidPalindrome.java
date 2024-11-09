package com.leetcode;

/**
 * <h3><a href="https://leetcode.com/problems/valid-palindrome/">Valid Palindrome</a></h3>
 * <p>
 *     A phrase is a <strong>palindrome</strong> if, after converting all uppercase letters into lowercase letters and
 *     removing all non-alphanumeric characters, it reads the same forward and backward.
 *     Alphanumeric characters include letters and numbers.
 * </p>
 * <p>
 *     Given a string <code>s</code>, return <code>true</code> if it is a palindrome, or <code>false</code> otherwise.
 * </p>
 * <p>
 *     <h6>Constraints:</h6>
 *     <ul>
 *         <li><code>1 <= s.length <= 2 * 10^5</code></li>
 *         <li><code>s</code> consists only of printable ASCII characters.</li>
 *     </ul>
 * </p>
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        var left = 0;
        var right = s.length() - 1;

        while (left < right) {
            char leftChar = s.charAt(left);
            while (!Character.isLetterOrDigit(leftChar) && ++left <= right) {
                leftChar = s.charAt(left);
            }

            char rightChar = s.charAt(right);
            while (!Character.isLetterOrDigit(rightChar) && left <= --right) {
                rightChar = s.charAt(right);
            }

            if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
