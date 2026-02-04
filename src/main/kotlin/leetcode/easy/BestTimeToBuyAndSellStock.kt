package org.example.leetcode.easy

/**
 * [121 Best time to buy and sell stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/)
 */
class BestTimeToBuyAndSellStock {
    // Bad performance, time limit exception
    fun maxProfit(prices: IntArray): Int {
        var maximizeProfit = 0
        for (i in prices.indices) {
            for (j in i + 1 until prices.size) {
                val newMaximizeProfit = prices[i] - prices[j]

                if (newMaximizeProfit < 0 && newMaximizeProfit < maximizeProfit) {
                    maximizeProfit = newMaximizeProfit
                }
            }
        }
        return maximizeProfit
    }
}
