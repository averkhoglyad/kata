package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ValidParenthesesTest {

    private final ValidParentheses it = new ValidParentheses();

    @Test
    void test1() {
//        Input: s = "()"
//        Output: true

        assertThat(it.isValid("()"))
                .isTrue();
    }

    @Test
    void test2() {
//        Input: s = "()[]{}"
//        Output: true

        assertThat(it.isValid("()[]{}"))
                .isTrue();
    }

    @Test
    void test3() {
//        Input: s = "(]"
//        Output: false

        assertThat(it.isValid("(]"))
                .isFalse();
    }

    @Test
    void test4() {
//        Input: s = "([])"
//        Output: true

        assertThat(it.isValid("([])"))
                .isTrue();
    }
}