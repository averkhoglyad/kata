package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LetterCombinationsInPhoneNumberTest {

    private final LetterCombinationsInPhoneNumber it = new LetterCombinationsInPhoneNumber();

    @Test
    void test0() {
        assertThat(it.letterCombinations("23"))
                .containsExactlyInAnyOrder("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
    }

    @Test
    void test1() {
        assertThat(it.letterCombinations(""))
                .isEmpty();
    }

    @Test
    void test2() {
        assertThat(it.letterCombinations("2"))
                .containsExactlyInAnyOrder("a","b","c");
    }

    @Test
    void test3() {
        assertThat(it.letterCombinations("273"))
                .containsExactlyInAnyOrder(
                        "apd", "ape", "apf",
                        "aqd", "aqe", "aqf",
                        "ard", "are", "arf",
                        "asd", "ase", "asf",

                        "bpd", "bpe", "bpf",
                        "bqd", "bqe", "bqf",
                        "brd", "bre", "brf",
                        "bsd", "bse", "bsf",

                        "cpd", "cpe", "cpf",
                        "cqd", "cqe", "cqf",
                        "crd", "cre", "crf",
                        "csd", "cse", "csf"
                );
    }

    @Test
    void test4() {
        assertThat(it.letterCombinations("5678"))
                .containsExactlyInAnyOrder("jmpt","jmpu","jmpv","jmqt","jmqu","jmqv","jmrt","jmru","jmrv","jmst","jmsu","jmsv","jnpt","jnpu","jnpv","jnqt","jnqu","jnqv","jnrt","jnru","jnrv","jnst","jnsu","jnsv","jopt","jopu","jopv","joqt","joqu","joqv","jort","joru","jorv","jost","josu","josv","kmpt","kmpu","kmpv","kmqt","kmqu","kmqv","kmrt","kmru","kmrv","kmst","kmsu","kmsv","knpt","knpu","knpv","knqt","knqu","knqv","knrt","knru","knrv","knst","knsu","knsv","kopt","kopu","kopv","koqt","koqu","koqv","kort","koru","korv","kost","kosu","kosv","lmpt","lmpu","lmpv","lmqt","lmqu","lmqv","lmrt","lmru","lmrv","lmst","lmsu","lmsv","lnpt","lnpu","lnpv","lnqt","lnqu","lnqv","lnrt","lnru","lnrv","lnst","lnsu","lnsv","lopt","lopu","lopv","loqt","loqu","loqv","lort","loru","lorv","lost","losu","losv");
    }

}