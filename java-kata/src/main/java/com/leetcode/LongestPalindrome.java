package com.leetcode;

/**
 * <h3><a href="https://leetcode.com/problems/longest-palindrome/">Longest Palindrome</a></h3>
 * <p>
 *     Given a string <code>s</code> which consists of lowercase or uppercase letters, return the length of
 *     the longest <a href="https://en.wikipedia.org/wiki/Palindrome">palindrome</a> that can be built with those letters.
 * </p>
 * <p>
 *     A palindrome is a string that reads the same forward and backward.
 * </p>
 * <p>
 *     Letters are case sensitive, for example, <code>"Aa"</code> is not considered a palindrome.
 * </p>
 * <p>
 *     <h6>Constraints:</h6>
 *     <ul>
 *         <li><code>1 <= s.length <= 2000</code></li>
 *         <li><code>s</code> consists of lowercase and/or uppercase English letters only.</li>
 *     </ul>
 * </p>
 */
public class LongestPalindrome {

    public int longestPalindrome(String s) {
        var freqs = new int[58];
        for (var ch : s.toCharArray()) {
            freqs[ch - 'A']++;
        }

        var result = 0;
        var odd = 0;
        for (int freq : freqs) {
            if (freq % 2 == 0) {
                result += freq;
            } else {
                odd = 1;
                result += freq - 1;
            }
        }
        return result + odd;
    }
}
