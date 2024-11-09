package com.leetcode;

/**
 * <h3><a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/">Best Time to Buy and Sell Stock</a></h3>
 * <p>
 *     You are given an array <code>prices</code> where <code>prices[i]</code>
 *     is the price of a given stock on the <code>i-th</code> day.
 * </p>
 * <p>
 *     You want to maximize your profit by choosing a <strong>single day</strong> to buy one stock and choosing
 *     a <strong>different day in the future</strong> to sell that stock.
 * </p>
 * <p>
 *     Return the maximum profit you can achieve from this transaction.
 *     If you cannot achieve any profit, return <code>0</code>.
 * </p>
 * <p>
 *     <h6>Constraints:</h6>
 *     <ul>
 *         <li><code>1 <= prices.length <= 10^5</code></li>
 *         <li><code>0 <= prices[i] <= 10^4</code></li>
 *     </ul>
 * </p>
 */
public class BestTimeToBuySellStock {

    public int maxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }

        var profit = 0;
        var minPrice = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                profit = Math.max(profit, prices[i] - minPrice);
            }
        }

        return profit;
    }
}
