package com.leetcode;

import java.util.ArrayDeque;

/**
 * <h3><a href="https://leetcode.com/problems/valid-parentheses/">Valid Parentheses</a></h3>
 *
 * <p>
 *     Given a string <code>s</code> containing just the characters
 *     <code>'('</code>, <code>')'</code>, <code>'{'</code>, <code>'}'</code>, <code>'['</code> and <code>']'</code>,
 *     determine if the input string is valid.
 * </p>
 * <p>
 *     An input string is valid if:
 *     <ol>
 *         <li>Open brackets must be closed by the same type of brackets.</li>
 *         <li>Open brackets must be closed in the correct order.</li>
 *         <li>Every close bracket has a corresponding open bracket of the same type.</li>
 *     </ol>
 * </p>
 * <p>
 *     <h6>Constraints:</h6>
 *     <ul>
 *         <li><code>1 <= s.length <= 10^4</code></li>
 *         <li><code>s</code> consists of parentheses only <code>'()[]{}'</code>.</li>
 *     </ul>
 * </p>
 * <p>
 *     <strong>Follow-up:</strong> Can you come up with an algorithm that is less than <code>O(n^2)</code> time complexity?
 * </p>
 */
public class ValidParentheses {

    public boolean isValid(String s) {
        var stack = new ArrayDeque<Character>();
        for (var i = 0; i < s.length(); i++) {
            var ch = s.charAt(i);
            if (isOpen(ch)) {
                stack.add(switchOpenToClose(ch));
                continue;
            }
            if (stack.isEmpty()) {
                return false;
            }
            if (stack.removeLast() != ch) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    private boolean isOpen(char ch) {
        return switch (ch) {
            case '(', '[', '{' -> true;
            default -> false;
        };
    }

    private char switchOpenToClose(char ch) {
        return switch (ch) {
            case '(' -> ')';
            case '[' -> ']';
            case '{' -> '}';
            default -> throw new IllegalArgumentException("Unexpected value: " + ch);
        };
    }
}
