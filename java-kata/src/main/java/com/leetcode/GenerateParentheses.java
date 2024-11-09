package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

/**
 * <h3><a href="https://leetcode.com/problems/generate-parentheses/">Generate Parentheses</a></h3>
 * <p>
 *     Given <code>n</code> pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 * </p>
 * <p>
 *     <h6>Constraints:</h6>
 *     <ul>
 *         <li><code>1 <= n <= 8</code></li>
 *     </ul>
 * </p>
 */
public class GenerateParentheses {

    public List<String> generateParenthesis(int n) {
        if (n < 1) {
            return Collections.emptyList();
        }

        var res = new ArrayList<String>();
        int[] pos = IntStream.range(0, n).toArray();
        var chars = new char[pos.length * 2];

        do {
            res.add(str(pos, chars));
        } while (mutate(pos));

        return res;
    }

    private boolean mutate(int[] pos) {
        int length = pos.length;
        for (var i = length - 1; i > 0; i--) {
            var maxNum = i * 2 - 1;
            if (pos[i] <= maxNum) {
                var value = pos[i] + 1;
                for (var j = i; j < length; j++) {
                    pos[j] = value++;
                }
                return true;
            }
        }
        return false;
    }

    private String str(int[] pos, char[] chars) {
        Arrays.fill(chars, ')');
        for (int p : pos) {
            chars[p] = '(';
        }
        return new String(chars);
    }
}
