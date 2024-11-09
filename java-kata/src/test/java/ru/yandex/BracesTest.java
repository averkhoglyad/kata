//package ru.yandex;
//
//import org.junit.jupiter.api.Test;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//class BracesTest {
//
//    @Test
//    void test1() {
//        assertThat(Braces.generate(1).toList())
//                .containsExactly("()");
//    }
//
//    @Test
//    void test2() {
//        assertThat(Braces.generate(2).toList())
//                .containsExactly(
//                        "(())",
//                        "()()");
//    }
//
//    @Test
//    void test3() {
//        assertThat(Braces.generate(3).toList())
//                .containsExactly(
//                        "((()))",
//                        "(()())",
//                        "(())()",
//                        "()(())",
//                        "()()()");
//    }
//
//    @Test
//    void test4() {
//        assertThat(Braces.generate(4).toList())
//                .containsExactly(
//                        "(((())))",
//                        "((()()))",
//                        "((())())",
//                        "((()))()",
//                        "(()(()))",
//                        "(()()())",
//                        "(()())()",
//                        "(())(())",
//                        "(())()()",
//                        "()((()))",
//                        "()(()())",
//                        "()(())()",
//                        "()()(())",
//                        "()()()()");
//    }
//
//}