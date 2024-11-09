package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GenerateParenthesesTest {

    final GenerateParentheses it = new GenerateParentheses();

    @Test
    void test1() {
        assertThat(it.generateParenthesis(1))
                .containsExactly("()");
    }

    @Test
    void test2() {
        assertThat(it.generateParenthesis(2))
                .containsExactly("(())", "()()");
    }

    @Test
    void test3() {
        assertThat(it.generateParenthesis(3))
                .containsExactly("((()))","(()())","(())()","()(())","()()()");
    }

    @Test
    void test4() {
        assertThat(it.generateParenthesis(4))
                .containsExactly(
                        "(((())))",
                        "((()()))",
                        "((())())",
                        "((()))()",
                        "(()(()))",
                        "(()()())",
                        "(()())()",
                        "(())(())",
                        "(())()()",
                        "()((()))",
                        "()(()())",
                        "()(())()",
                        "()()(())",
                        "()()()()");
    }

}