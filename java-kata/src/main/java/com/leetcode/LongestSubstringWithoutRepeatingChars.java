package com.leetcode;

import java.util.Arrays;
import java.util.BitSet;

/**
 * <h3><a href="https://leetcode.com/problems/longest-substring-without-repeating-characters/">Longest Substring Without Repeating Characters</a></h3>
 * <p>
 * Given a string s, find the length of the longest substring without repeating characters.
 * </p>
 * <p>
 * <h6>Constraints:</h6>
 *     <ul>
 *         <li><code>0 <= s.length <= 5 * 10^4</code></li>
 *         <li><code>s</code> consists of English letters, digits, symbols and spaces.</li>
 *     </ul>
 * </p>
 */
public class LongestSubstringWithoutRepeatingChars {

    public int lengthOfLongestSubstring(String s) {
        if (s.length() < 2) {
            return s.length();
        }
        var best = 0;
        var chars = s.toCharArray();
        var used = new boolean[127 - ' '];

        var right = 0;
        var left = 0;

        while(right < chars.length) {
            while (right < chars.length && !used[chars[right] - ' ']) {
                used[chars[right++] - ' '] = true;
            }
            used[chars[left++] - ' '] = false;
            best = Math.max(right - left + 1, best);
        }

        return best;
    }

    public int lengthOfLongestSubstring1(String s) {
        if (s.length() < 2) {
            return s.length();
        }
        var best = 0;
        var chars = s.toCharArray();
        var used = new BitSet(127 - ' ');

        var right = 0;
        var left = 0;

        while(right < chars.length) {
            while (right < chars.length && !used.get(chars[right] - ' ')) {
                used.set(chars[right++] - ' ', true);
            }
            used.set(chars[left++] - ' ', false);
            best = Math.max(right - left + 1, best);
        }

        return best;
    }

    public int lengthOfLongestSubstring0(String s) {
        if (s.length() < 2) {
            return s.length();
        }
        var best = 0;
        var chars = s.toCharArray();
        var used = new int[127 - ' '];
        Arrays.fill(used, -1);

        var left = 0;
        for (int right = 0; right < chars.length; right++) {
            var prevPosition = used[chars[right] - ' '];
            if (prevPosition < left) {
                best = Math.max(right - left + 1, best);
            } else {
                left = prevPosition + 1;
                if (chars.length - left < best) {
                    break;
                }
            }
            used[chars[right] - ' '] = right;
        }

        return best;
    }
}
