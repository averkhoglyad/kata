package com.leetcode;

/**
 * <h3><a href="https://leetcode.com/problems/ransom-note/">Ransom Note</a></h3>
 * <p>
 *     Given two strings <code>ransomNote</code> and <code>magazine</code>, return <code>true</code>
 *     if <code>ransomNote</code> can be constructed by using the letters from <code>magazine</code>
 *     and <code>false</code> otherwise.
 * </p>
 * <p>
 *     Each letter in <code>magazine</code> can only be used once in <code>ransomNote</code>.
 * </p>
 * <p>
 *     <h6>Constraints:</h6>
 *     <ul>
 *         <li><code>1 <= ransomNote.length, magazine.length <= 10^5</code></li>
 *         <li><code>ransomNote</code> and <code>magazine</code> consist of lowercase English letters</li>
 *     </ul>
 * </p>
 */
public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        final int[] freqs = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            freqs[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if (freqs[ransomNote.charAt(i) - 'a'] == 0) {
                return false;
            }
            freqs[ransomNote.charAt(i) - 'a']--;
        }
        return true;
    }
}
