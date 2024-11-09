package com.leetcode;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.emptyList;

/**
 * <h3><a href="https://leetcode.com/problems/letter-combinations-of-a-phone-number/">Letter Combinations of a Phone Number</a></h3>
 * <p>
 *     Given a string containing digits from <code>2-9</code> inclusive, return all possible letter combinations
 *     that the number could represent. Return the answer <strong>in any order</strong>. A mapping of digits to letters
 *     (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
 * </p>
 *
 * <p>
 *     <h6>Constraints:</h6>
 *     <ul>
 *         <li><code>0 <= digits.length <= 4</code></li>
 *         <li><code>digits[i]</code> is a digit in the range <code>['2', '9']</code></li>
 *     </ul>
 * </p>
 */
public class LetterCombinationsInPhoneNumber {

    private static final char[][] LETTERS = new char[][] {
            new char[] { 'a', 'b', 'c' },
            new char[] { 'd', 'e', 'f' },
            new char[] { 'g', 'h', 'i' },
            new char[] { 'j', 'k', 'l' },
            new char[] { 'm', 'n', 'o' },
            new char[] { 'p', 'q', 'r', 's' },
            new char[] { 't', 'u', 'v' },
            new char[] { 'w', 'x', 'y', 'z' },
    };

    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return emptyList();
        }

        char[] chars = digits.toCharArray();

        var count = LETTERS[chars[0] - '2'].length;
        for (int i = chars.length - 1; i > 0; i--) {
            count *= LETTERS[chars[i] - '2'].length;
        }

        var digitFract = new int[chars.length];
        digitFract[chars.length - 1] = 1;
        for (int i = chars.length - 2; i >= 0; i--) {
            digitFract[i] = LETTERS[chars[i + 1] - '2'].length * digitFract[i + 1];
        }

        var res = new ArrayList<String>(count);
        for (int i = 0; i < count; i++) {
            var chs = new char[chars.length];
            for (int j = 0; j < chars.length; j++) {
                chs[j] = LETTERS[chars[j] - '2'][(i / digitFract[j]) % LETTERS[chars[j] - '2'].length];
            }
            res.add(new String(chs));
        }

        return res;
    }
}
