package com.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * <h3><a href="https://leetcode.com/problems/basic-calculator-ii/">Basic Calculator II</a></h3>
 * <p>
 *     Given a string <code>s</code> which represents an expression, <strong><em>evaluate this expression and return its value</em></strong>.
 *     The integer division should truncate toward zero. You may assume that the given expression is always valid.
 *     All intermediate results will be in the range of <code>[-2^31, 2^31 - 1]</code>.
 * </p>
 * <p>
 *     <strong>Note:</strong>
 *     You are not allowed to use any built-in function which evaluates strings as mathematical expressions, such as eval().
 * </p>
 * <p>
 *     <h6>Constraints:</h6>
 *     <ul>
 *         <li><code>1 <= s.length <= 3 * 10^5</code></li>
 *         <li><code>s</code> consists of integers and operators <code>('+', '-', '*', '/')</code> separated by some number of spaces.</li>
 *         <li><code>s</code> represents <strong>a valid expression</strong>.</li>
 *         <li>All the integers in the expression are non-negative integers in the range <code>[0, 2^31 - 1]</code></li>
 *         <li>The answer is <strong>guaranteed</strong> to fit in <strong>a 32-bit integer</strong>.</li>
 *     </ul>
 * </p>
 */
public class BasicCalculator2 {

    // Fast solution, but it can't be extended with new operators
    public int calculate(String s) {
        var stack = new ArrayDeque<Integer>();
        var operation = '+';
        var operand = 0;
        for (char ch : s.toCharArray()) {
            if (ch == ' ') {
                continue;
            }
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                calculate(stack, operation, operand);
                operation = ch;
                operand = 0;
            } else {
                operand = operand * 10 + (ch - '0');
            }
        }
        calculate(stack, operation, operand);
        return stack.stream().reduce(0, Integer::sum);
    }

    private static void calculate(Deque<Integer> stack, char operation, int operand) {
        switch (operation) {
            case '-' -> stack.add(operand * -1);
            case '*' -> stack.add(stack.removeLast() * operand);
            case '/' -> stack.add(stack.removeLast() / operand);
            default -> stack.add(operand);
        }
    }
}
