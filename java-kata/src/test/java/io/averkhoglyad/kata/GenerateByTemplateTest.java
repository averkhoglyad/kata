package io.averkhoglyad.kata;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class GenerateByTemplateTest {

    private final GenerateByTemplate it = new GenerateByTemplate();

    @ParameterizedTest
    @ValueSource(strings = {
            "",
            "0",
            "1",
            "00",
            "11",
            "010",
            "101",
    })
    void test0(String input) {
        assertThat(it.generateList(input))
                .containsExactlyInAnyOrder(input);
    }

    @Test
    void test1() {
        var input = "?";
        assertThat(it.generateList(input))
                .containsExactlyInAnyOrder("0", "1");
    }

    @Test
    void test2() {
        var input = "??";
        assertThat(it.generateList(input))
                .containsExactlyInAnyOrder("00", "10", "01", "11");
    }

    @Test
    void test3() {
        var input = "0?";
        assertThat(it.generateList(input))
                .containsExactlyInAnyOrder("00", "01");
    }

    @Test
    void test4() {
        var input = "0?1?";
        assertThat(it.generateList(input))
                .containsExactlyInAnyOrder("0010", "0110", "0011", "0111");
    }

    @Test
    void test5() {
        var input = "???";
        assertThat(it.generateList(input))
                .containsExactlyInAnyOrder(
                        "000",
                        "100",
                        "010",
                        "110",
                        "001",
                        "101",
                        "011",
                        "111"
                );
    }

    @Test
    void test6() {
        var input = "010?010??";
        assertThat(it.generateList(input))
                .containsExactlyInAnyOrder(
                        "010001000",
                        "010101000",
                        "010001010",
                        "010101010",
                        "010001001",
                        "010101001",
                        "010001011",
                        "010101011"
                );
    }
}