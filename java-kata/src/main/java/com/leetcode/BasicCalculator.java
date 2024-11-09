package com.leetcode;

import java.util.PrimitiveIterator;

/**
 * <h3><a href="https://leetcode.com/problems/basic-calculator/">Basic Calculator</a></h3>
 * <p>
 *     Given a string <code>s</code> representing a valid expression, implement a basic calculator to evaluate it, and return
 *     <strong><em>the result of the evaluation</em></strong>.
 * </p>
 * <p>
 *     <strong>Note:</strong>
 *     You are <strong>not</strong> allowed to use any built-in function which evaluates strings as mathematical expressions, such as <code>eval()</code>.
 * </p>
 * <p>
 *     <h6>Constraints:</h6>
 *     <ul>
 *         <li><code>1 <= s.length <= 3 * 10^5</code></li>
 *         <li><code>s</code> consists of digits and operators <code>'+'</code>, <code>'-'</code>, <code>'('</code>, <code>')'</code>, and <code>' '</code>.</li>
 *         <li><code>s</code> represents <strong>a valid expression</strong>.</li>
 *         <li><code>'+'</code> is <strong>not</strong> used as a unary operation (i.e., <code>"+1"</code> and <code>"+(2 + 3)"</code> is invalid)</li>
 *         <li><code>'-'</code> could be used as a unary operation (i.e., <code>"-1"</code> and <code>"-(2 + 3)"</code> is valid)</li>
 *         <li>There will be no two consecutive operators in the input.</li>
 *         <li>Every number and running calculation will fit in a signed 32-bit integer.</li>
 *     </ul>
 * </p>
 */
public class BasicCalculator {

    public int calculate(String s) {
        return doCalculate(s.chars().iterator());
    }

    private int doCalculate(PrimitiveIterator.OfInt iterator) {
        int result = 0;
        int operand = 0;
        int negation = 1;

        while (iterator.hasNext()) {
            char ch = (char) iterator.nextInt();
            if (ch == ' ') {
                continue;
            }
            if (ch == '(') {
                operand = doCalculate(iterator);
                result += operand * negation;
                operand = 0;
                negation = 1;
            } else if (ch == ')') {
                break;
            } else if (ch == '-') {
                result += operand * negation;
                operand = 0;
                negation = -1;
            } else if (ch == '+') {
                result += operand * negation;
                operand = 0;
                negation = 1;
            } else {
                operand = operand * 10 + (ch - '0');
            }
        }

        result += operand * negation;
        return result;
    }
}
