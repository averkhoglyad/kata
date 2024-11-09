package com.leetcode;

import java.util.ArrayList;
import java.util.PrimitiveIterator;

/**
 * <h3><a href="https://leetcode.com/problems/parsing-a-boolean-expression/">Parsing a Boolean Expression</a></h3>
 * <p>
 *     A boolean expression is an expression that evaluates to either true or false. It can be in one of the following shapes:
 *     <ul>
 *         <li><code>'t'</code> that evaluates to <code>true</code>.</li>
 *         <li><code>'f'</code> that evaluates to <code>false</code>.</li>
 *         <li><code>'!(subExpr)'</code> that evaluates to <strong>the logical NOT</strong> of the inner expression <code>subExpr</code>.</li>
 *         <li><code>'&(subExpr1, subExpr2, ..., subExprn)'</code> that evaluates to <strong>the logical AND</strong> of the inner expressions <code>subExpr1, subExpr2, ..., subExprn</code> where <code>n >= 1</code>.</li>
 *         <li><code>'|(subExpr1, subExpr2, ..., subExprn)'</code> that evaluates to <strong>the logical OR</strong> of the inner expressions <code>subExpr1, subExpr2, ..., subExprn</code> where <code>n >= 1</code>.</li>
 *     </ul>
 * </p>
 * <p>
 *     Given a string <code>expression</code> that represents a boolean expression, return the evaluation of that expression.
 *     It is <strong>guaranteed</strong> that the given expression is valid and follows the given rules.
 * </p>
 * <p>
 *     <h6>Constraints:</h6>
 *     <ul>
 *         <li><code>1 <= expression.length <= 2 * 10^4</code></li>
 *         <li>expression[i] is one following characters: <code>'('</code>, <code>')'</code>, <code>'&'</code>, <code>'|'</code>, <code>'!'</code>, <code>'t'</code>, <code>'f'</code>, and <code>','</code>.</li>
 *     </ul>
 * </p>
 */
public class ParsingBooleanExpression {

    public boolean parseBoolExpr(String expression) {
        return evaluate(expression.chars().iterator());
    }

    private boolean evaluate(PrimitiveIterator.OfInt iterator) {
        var ch = (char) iterator.nextInt();
        return switch (ch) {
            case 't' -> true;
            case 'f' -> false;
            default -> evaluate(ch, iterator);
        };
    }

    private boolean evaluate(char operation, PrimitiveIterator.OfInt iterator) {
        var args = new ArrayList<Boolean>();
        var ch = (char) iterator.nextInt(); // '('
        while (ch != ')') {
            args.add(evaluate(iterator));
            ch = (char) iterator.nextInt();
        }

        return switch (operation) {
            case '!' -> !args.get(0);
            case '&' -> args.stream().allMatch(it -> it);
            case '|' -> args.stream().anyMatch(it -> it);
            default -> throw new IllegalStateException();
        };
    }
}
