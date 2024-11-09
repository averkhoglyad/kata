package com.leetcode;

/**
 * <h3><a href="https://leetcode.com/problems/longest-palindromic-substring/">Longest Palindromic Substring</a></h3>
 * 
 * <p>
 *     Given a string s, return the longest palindromic substring in s
 * </p>
 *
 * <p>
 *     <h6>Constraints:</h6>
 *     <ul>
 *         <li><code>1 <= s.length <= 1000</code></li>
 *         <li><code>s</code> consist of only digits and English letters</li>
 *     </ul>
 * </p>
 */
public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if (s.length() < 2) {
            return s;
        }
        char[] chars = s.toCharArray();
        int resFrom = 0;
        int resTo = 1;

        for (int i = 0, charsLength = chars.length; i < charsLength - (resTo - resFrom); i++) {
            for (int j = charsLength; j >= i - (resTo - resFrom); j--) {
                var isPalindrome = true;
                var mid = (j - i) / 2;
                for (var k = 0; k <= mid; k++) {
                    if (chars[i + k] != chars[j - k -1]) {
                        isPalindrome= false;
                        break;
                    }
                }
                if (isPalindrome) {
                    if (j - i > resTo - resFrom) {
                        resFrom = i;
                        resTo = j;
                    }
                    break;
                }
            }
        }

        return s.substring(resFrom, resTo);
    }
}
