package com.codewars;

import java.util.function.IntUnaryOperator;

import static java.util.function.IntUnaryOperator.identity;

public class CamelCaseConvert {

    static String toCamelCase(String s) {
        var sb = new StringBuilder();
        s.codePoints().boxed().reduce(State.DEFAULT, (m, cp) -> m.apply(sb, cp), State::combine);
        return sb.toString();
    }

    private enum State {
        DEFAULT(identity()),
        UPPERCASED(Character::toUpperCase);

        private final IntUnaryOperator modifier;

        State(IntUnaryOperator modifier) {
            this.modifier = modifier;
        }

        public State apply(StringBuilder sb, int cp) {
            if (cp == '-' || cp == '_') {
                return UPPERCASED;
            }
            sb.appendCodePoint(this.modifier.applyAsInt(cp));
            return DEFAULT;
        }

        public static State combine(State left, State right) {
            return left.compareTo(right) > 0 ? left : right;
        }
    }

}
