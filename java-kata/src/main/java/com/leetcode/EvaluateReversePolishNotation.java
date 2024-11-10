package com.leetcode;

import java.util.ArrayDeque;

/**
 * <h3><a href="https://leetcode.com/problems/evaluate-reverse-polish-notation/">Evaluate Reverse Polish Notation</a></h3>
 * <p>
 *     You are given an array of strings tokens that represents an arithmetic expression
 *     in a <a href="http://en.wikipedia.org/wiki/Reverse_Polish_notation">Reverse Polish Notation</a>.
 *     Evaluate the expression. Return an integer that represents the value of the expression.
 * </p>
 * <p>
 *     <strong>Note that:</strong>
 *     <ul>
 *         <li>The valid operators are <code>'+'</code>, <code>'-'</code>, <code>'*'</code> and <code>'/'</code>.</li>
 *         <li>Each operand may be an integer or another expression.</li>
 *         <li>The division between two integers always <strong>truncates toward zero</strong>.</li>
 *         <li>There will not be any division by zero.</li>
 *         <li>The input represents a valid arithmetic expression in a reverse polish notation.</li>
 *         <li>The answer and all the intermediate calculations can be represented in a <strong>32-bit</strong> integer.</li>
 *     </ul>
 * </p>
 * <p>
 *     <h6>Constraints:</h6>
 *     <ul>
 *         <li>
 *             <code>1 <= tokens.length <= 10^4</code>
 *         </li>
 *         <li>
 *             <code>tokens[i]</code> is either an operator: <code>'+'</code>, <code>'-'</code>, <code>'*'</code> or
 *             <code>'/'</code> or an integer in the range <code>[-200, 200]</code>
 *         </li>
 *     </ul>
 * </p>
 */
public class EvaluateReversePolishNotation {

    public int evalRPN(String[] tokens) {
        var stack = new ArrayDeque<Integer>();
        for (var token : tokens) {
            switch (token) {
                case "+" -> {
                    var right = stack.removeLast();
                    var left = stack.removeLast();
                    stack.add(left + right);
                }
                case "-" -> {
                    var right = stack.removeLast();
                    var left = stack.removeLast();
                    stack.add(left - right);
                }
                case "*" -> {
                    var right = stack.removeLast();
                    var left = stack.removeLast();
                    stack.add(left * right);
                }
                case "/" -> {
                    var right = stack.removeLast();
                    var left = stack.removeLast();
                    stack.add(left / right);
                }
                default -> stack.add(Integer.parseInt(token));
            }
        }
        return stack.element();
    }
}
