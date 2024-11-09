package com.leetcode;

/**
 * <h3><a href="https://leetcode.com/problems/valid-anagram/">Valid Anagram</a></h3>
 *
 * <p>
 *     Given two strings <code>s</code> and <code>t</code>,
 *     return <code>true</code> if <code>t</code> is an <a href="https://en.wikipedia.org/wiki/Anagram">anagram</a> of <code>s</code>,
 *     and <code>false</code> otherwise.
 * </p>
 * <p>
 *     An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 *     using all the original letters exactly once.
 * </p>
 * <p>
 *     <h6>Constraints:</h6>
 *     <ul>
 *         <li><code>1 <= s.length, t.length <= 5 * 10^4</code></li>
 *         <li><code>s</code> and <code>t</code> consist of lowercase English letters.</li>
 *     </ul>
 * </p>
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        var freqs = new int[26];
        for (var i = s.length() - 1; i >= 0; i--) {
            freqs[s.charAt(i) - 'a']++;
            freqs[t.charAt(i) - 'a']--;
        }
        for (var f : freqs) {
            if (f != 0) return false;
        }
        return true;
    }
}
