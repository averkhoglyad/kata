package com.leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * <h3><a href="https://leetcode.com/problems/basic-calculator-ii/">Basic Calculator II</a></h3>
 * <p>
 *     Given a string <code>s</code> which represents an expression, <strong><code>evaluate this expression and return its value</code></strong>.
 *     The integer division should truncate toward zero. You may assume that the given expression is always valid.
 *     All intermediate results will be in the range of [-2^31, 2^31 - 1].
 * </p>
 * <p>
 *     <strong>Note:</strong> You are not allowed to use any built-in function which evaluates strings as mathematical expressions, such as eval().
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
public class Calculator {

    public int calculate(String s) {
        var eval = new Eval();
        for (var ch : s.toCharArray()) {
            if (Character.isWhitespace(ch)) {
                continue;
            }
            eval.consume(ch);
        }
        return eval.result();
    }

    private static class Eval {

        private final Deque<Operator> operators = new ArrayDeque<>();
        private final Deque<Integer> operands = new ArrayDeque<>();

        private int lastOperand = 0;

        int result() {
            forceEvaluation();
            return operands.removeLast();
        }

        void consume(char ch) {
            var operator = Operators.detectOperator(ch);
            if (operator == null) {
                nextDigit(ch);
            } else {
                nextOperator(operator);
            }
        }

        private void nextDigit(char ch) {
            lastOperand = lastOperand * 10 + (ch - '0');
        }

        private void nextOperator(Operator operator) {
            evaluationWhile(op -> operator.compareTo(op) <= 0);
            operators.addLast(operator);
        }

        private void forceEvaluation() {
            evaluationWhile(__ -> true);
        }

        private void evaluationWhile(Predicate<Operator> predicate) {
            operands.addLast(lastOperand);
            lastOperand = 0;
            while (operators.size() > 0 && predicate.test(operators.getLast())) {
                operands.addLast(operators.removeLast().apply(operands::removeLast));
            }
        }
    }

    private static abstract class Operators implements Operator {

        private static final List<Operators> values = new ArrayList<>();

        static final Operator PLUS = new Calculator.Operators('+', (byte) 1) {
            @Override
            public Integer apply(Supplier<Integer> operandSupplier) {
                return operandSupplier.get() + operandSupplier.get();
            }
        };
        static final Operator MINUS = new Calculator.Operators('-', (byte) 1) {
            @Override
            public Integer apply(Supplier<Integer> operandSupplier) {
                int right = operandSupplier.get();
                return operandSupplier.get() - right;
            }
        };
        static final Operator MULTIPLY = new Calculator.Operators('*', (byte) 2) {
            @Override
            public Integer apply(Supplier<Integer> operandSupplier) {
                return operandSupplier.get() * operandSupplier.get();
            }
        };
        static final Operator DIVIDE = new Calculator.Operators('/', (byte) 2) {
            @Override
            public Integer apply(Supplier<Integer> operandSupplier) {
                int right = operandSupplier.get();
                return operandSupplier.get() / right;
            }
        };
        static final Operator POWER = new Calculator.Operators('^', (byte) 3) {
            @Override
            public Integer apply(Supplier<Integer> operandSupplier) {
                int right = operandSupplier.get();
                return (int) Math.pow(operandSupplier.get(), right);
            }
        };

        private final char aChar;
        private final byte priority;

        private Operators(char aChar, byte priority) {
            this.aChar = aChar;
            this.priority = priority;
            values.add(this);
        }

        @Override
        public byte priority() {
            return this.priority;
        }

        static Operator detectOperator(char ch) {
            for (var value : values) {
                if (value.aChar == ch) {
                    return value;
                }
            }
            return null;
        }
    }

    private interface Operator extends Comparable<Operator> {

        Integer apply(Supplier<Integer> operandSupplier);

        byte priority();

        @Override
        default int compareTo(Operator other) {
            return this.priority() - other.priority();
        }
    }
}
