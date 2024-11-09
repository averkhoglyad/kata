package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static test.ArrayUtil.arrayOf;

class BestTimeToBuySellStockTest {

    private final BestTimeToBuySellStock it = new BestTimeToBuySellStock();

    @Test
    void test1() {
//        Input: prices = [7,1,5,3,6,4]
//        Output: 5
//        Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//        Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

        var prices = arrayOf(7, 1, 5, 3, 6, 4);
        assertThat(it.maxProfit(prices))
                .isEqualTo(5);
    }

    @Test
    void test2() {
//        Input: prices = [7,6,4,3,1]
//        Output: 0
//        Explanation: In this case, no transactions are done and the max profit = 0.

        var prices = arrayOf(7,6,4,3,1);
        assertThat(it.maxProfit(prices))
                .isZero();
    }
}