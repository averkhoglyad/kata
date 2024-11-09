package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NumberOfAtomsTest {

    final NumberOfAtoms it = new NumberOfAtoms();

    @Test
    void test0() {
        assertThat(it.countOfAtoms("Au"))
                .isEqualTo("Au");
        assertThat(it.countOfAtoms("H123"))
                .isEqualTo("H123");
        assertThat(it.countOfAtoms("NaCl"))
                .isEqualTo("ClNa");
        assertThat(it.countOfAtoms("H2SO4"))
                .isEqualTo("H2O4S");
        assertThat(it.countOfAtoms("H2O2"))
                .isEqualTo("H2O2");
        assertThat(it.countOfAtoms("Na2(OH)"))
                .isEqualTo("HNa2O");
    }

    @Test
    void test1() {
//        Input: formula = "H2O"
//        Output: "H2O"
//        Explanation: The count of elements are {'H': 2, 'O': 1}.
        assertThat(it.countOfAtoms("H2O"))
                .isEqualTo("H2O");
    }

    @Test
    void test2() {
//        Input: formula = "Mg(OH)2"
//        Output: "H2MgO2"
//        Explanation: The count of elements are {'H': 2, 'Mg': 1, 'O': 2}.
        assertThat(it.countOfAtoms("Mg(OH)2"))
                .isEqualTo("H2MgO2");
    }

    @Test
    void test3() {
//        Input: formula = "K4(ON(SO3)2)2"
//        Output: "K4N2O14S4"
//        Explanation: The count of elements are {'K': 4, 'N': 2, 'O': 14, 'S': 4}.
        assertThat(it.countOfAtoms("K4(ON(SO3)2)2"))
                .isEqualTo("K4N2O14S4");
    }
}