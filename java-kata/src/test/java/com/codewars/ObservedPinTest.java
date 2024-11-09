package com.codewars;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static test.ArrayUtil.arrayOf;

class ObservedPinTest {

    @ParameterizedTest
    @MethodSource("expectations")
    public void testPins(String entered, String[] expected) {
        assertThat(ObservedPin.getPINs(entered))
                .containsExactlyInAnyOrder(expected);
    }

    static Stream<Arguments> expectations() {
        return Stream.of(
                arguments("8", arrayOf("5", "7", "8", "9", "0")),
                arguments("11", arrayOf("11", "21", "41", "12", "22", "42", "14", "24", "44")),
                arguments("369", arrayOf("236", "238", "239", "256", "258", "259", "266", "268", "269", "296", "298", "299", "336", "338", "339", "356", "358", "359", "366", "368", "369", "396", "398", "399", "636", "638", "639", "656", "658", "659", "666", "668", "669", "696", "698", "699"))
        );
    }
}