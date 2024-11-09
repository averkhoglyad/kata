package com.leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BestTimeToBuySellStockTest {

    private val it = BestTimeToBuySellStock()

    @Test
    fun test1() {
//        Input: prices = [7,1,5,3,6,4]
//        Output: 5
//        Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//        Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

        val prices = intArrayOf(7, 1, 5, 3, 6, 4)
        assertThat(it.maxProfit(prices))
            .isEqualTo(5)
    }

    @Test
    fun test2() {
//        Input: prices = [7,6,4,3,1]
//        Output: 0
//        Explanation: In this case, no transactions are done and the max profit = 0.

        val prices = intArrayOf(7, 6, 4, 3, 1)
        assertThat(it.maxProfit(prices))
            .isZero()
    }
}