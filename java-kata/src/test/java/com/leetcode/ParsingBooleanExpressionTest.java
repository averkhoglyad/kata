package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ParsingBooleanExpressionTest {

    final ParsingBooleanExpression it = new ParsingBooleanExpression();

    @Test
    void test0() {
        assertThat(it.parseBoolExpr("t")).isTrue();
        assertThat(it.parseBoolExpr("f")).isFalse();
        assertThat(it.parseBoolExpr("!(t)")).isFalse();
        assertThat(it.parseBoolExpr("&(t,f)")).isFalse();
        assertThat(it.parseBoolExpr("|(f,t)")).isTrue();
    }

    @Test
    void test1() {
//        Input: expression = "&(|(f))"
//        Output: false
//        Explanation:
//        First, evaluate |(f) --> f. The expression is now "&(f)".
//        Then, evaluate &(f) --> f. The expression is now "f".
//        Finally, return false.
        assertThat(it.parseBoolExpr("&(|(f))"))
                .isFalse();
    }

    @Test
    void test2() {
//        Input: expression = "|(f,f,f,t)"
//        Output: true
//        Explanation: The evaluation of (false OR false OR false OR true) is true.
        assertThat(it.parseBoolExpr("|(f,f,f,t)"))
                .isTrue();
    }

    @Test
    void test3() {
//        Input: expression = "!(&(f,t))"
//        Output: true
//        Explanation:
//        First, evaluate &(f,t) --> (false AND true) --> false --> f. The expression is now "!(f)".
//        Then, evaluate !(f) --> NOT false --> true. We return true.
        assertThat(it.parseBoolExpr("!(&(f,t))"))
                .isTrue();
    }
}