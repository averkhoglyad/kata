package ru.yandex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SumMultiplyCalculationExpressionTest {

    final SumMultiplyCalculationExpression it = new SumMultiplyCalculationExpression();

    @Test
    void test1() {
        assertThat(it.calculate(""))
                .isEqualTo(0);
    }

    @Test
    void test2() {
        assertThat(it.calculate("1"))
                .isEqualTo(1);
    }

    @Test
    void test3() {
        assertThat(it.calculate("1+2"))
                .isEqualTo(3);
    }

    @Test
    void test4() {
        assertThat(it.calculate("23"))
                .isEqualTo(23);
    }

    @Test
    void test5() {
        assertThat(it.calculate("2+2*2"))
                .isEqualTo(6);
    }

    @Test
    void test6() {
        assertThat(it.calculate("3*3+3"))
                .isEqualTo(12);
    }

    @Test
    void test7() {
        assertThat(it.calculate("5+5*5+5"))
                .isEqualTo(35);
    }

    @Test
    void test8() {
        assertThat(it.calculate("6*6+6*6"))
                .isEqualTo(72);
    }

    @Test
    void test9() {
        assertThat(it.calculate("1+2+3+4*5*6*7+8+9*10"))
                .isEqualTo(944);
    }
}