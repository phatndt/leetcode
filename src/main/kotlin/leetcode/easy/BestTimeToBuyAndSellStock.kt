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

    /**
     *  Input: prices = [7,1,5,3,6,4]
     *     Output: 5
     *     Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
     *     Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
     */
    fun maxProfit2(prices: IntArray): Int {
        var minPrice = Int.MAX_VALUE
        var maxProfit = 0

        for (price in prices) {
            if (price < minPrice) {
                minPrice = price
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit
    }

    /**
     *  Input: prices = [7,1,5,3,6,4]
     *     Output: 5
     *     Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
     *     Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
     */
    fun maxProfit3(prices: IntArray): Int {
        var left = 0
        var right = 1
        var maxProfit = prices[right-left]

        while (right < prices.size) {
            if (prices[right] > prices[left]) {
                maxProfit = maxOf(prices[right] - prices[left], maxProfit)
            } else {
                left = right
            }
            right++
        }
        return maxProfit
    }

    /**
     *  [5, 2, -1, 0, 3] and value of k = 3 and n = 5
     */
    fun slidingWindow(arr: IntArray, k: Int): Int {
        require(k <= arr.size) { "k must be smaller than or equal to array size" }

        var windowSum = 0
        for (i in 0 until k) {
            windowSum += arr[i]
        }

        var maxSum = windowSum

        for (i in k until arr.size) {
            windowSum += arr[i]
            windowSum -= arr[i - k]
            maxSum = maxOf(maxSum, windowSum)
        }

        return maxSum
    }



}
