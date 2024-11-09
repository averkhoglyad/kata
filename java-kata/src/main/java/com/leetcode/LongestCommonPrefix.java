package com.leetcode;

/**
 * <h3><a href="">Longest Common Prefix</a></h3>
 * <p>
 *     Write a function to find the longest common prefix string amongst an array of strings.
 *     If there is no common prefix, return an empty string "".
 * </p>
 * <p>
 *     <h6>Constraints:</h6>
 *     <ul>
 *         <li><code>1 <= strs.length <= 200</code></li>
 *         <li><code>0 <= strs[i].length <= 200</code></li>
 *         <li><code>strs[i]</code>consists of only lowercase English letters</li>
 *     </ul>
 * </p>
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length < 1) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }

        var first = strs[0].toCharArray();
        var length = first.length;
        for (int i = strs.length - 1; i >= 1; i--) {
            var current = strs[i].toCharArray();
            var l = Math.min(strs[i].length(), length);
            int j = 0;
            while (j < l && first[j] == current[j]) {
                j++;
            }
            length = j;
        }

        return length > 0 ? new String(first, 0, length) : "";
    }

}
