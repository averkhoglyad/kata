package com.leetcode

import kotlin.math.max

/**
 * ### [Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)
 *
 * You are given an array `prices` where `prices[i]`
 * is the price of a given stock on the `i-th` day.
 *
 * You want to maximize your profit by choosing a **single day** to buy one stock and choosing
 * a **different day in the future** to sell that stock.
 *
 * Return the maximum profit you can achieve from this transaction.
 * If you cannot achieve any profit, return `0`.
 *
 * ###### Constraints:
 *  - `1 <= prices.length <= 10^5`
 *  - `0 <= prices[i] <= 10^4`
 */
class BestTimeToBuySellStock {
    fun maxProfit(prices: IntArray): Int {
        if (prices.size < 2) {
            return 0
        }
        var minPrice = Int.MAX_VALUE
        var profit = 0
        for (price in prices) {
            if (price < minPrice) {
                minPrice = price
            } else {
                profit = max(profit, price - minPrice)
            }
        }
        return profit
    }
}
