package ru.yandex;

import java.util.ArrayDeque;
import java.util.Deque;

public class SumMultiplyCalculationExpression {

    public int calculate(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        Deque<Integer> operands = new ArrayDeque<>();
        Deque<Character> operators = new ArrayDeque<>();

        int pos = 0;
        int length = str.length();
        char[] chars = str.toCharArray();
        while (pos < length) {

            int current = 0;
            while (pos < length && Character.isDigit(chars[pos])) {
                current *= 10;
                current += parseInt(chars[pos++]);
            }
            operands.add(current);

            if (pos >= length) {
                break;
            }

            char op = chars[pos++];

            while (operators.size() > 0 && operators.getLast() <= op) {
                var prevOp = operators.removeLast();
                var left = operands.removeLast();
                var right = operands.removeLast();
                if (prevOp == '*') {
                    operands.add(left * right);
                } else if (prevOp == '+') {
                    operands.add(left + right);
                } else {
                    throw new IllegalStateException();
                }
            }
            operators.add(op);
        }

        while (operators.size() > 0) {
            var prevOp = operators.removeLast();
            var left = operands.removeLast();
            var right = operands.removeLast();
            if (prevOp == '*') {
                operands.add(left * right);
            } else if (prevOp == '+') {
                operands.add(left + right);
            } else {
                throw new IllegalStateException();
            }
        }

        return operands.getFirst();
    }

    private int parseInt(char ch) {
        return ch - '0';
    }
}
