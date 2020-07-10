package com.yourtion.leetcode.daily.m07.d10;

/**
 * 309. 最佳买卖股票时机含冷冻期
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/
 */
public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }

        int n = prices.length;
        int f0 = -prices[0];
        int f1 = 0;
        int f2 = 0;
        for (int i = 1; i < n; ++i) {
            int newF0 = Math.max(f0, f2 - prices[i]);
            int newF1 = f0 + prices[i];
            int newF2 = Math.max(f1, f2);
            f0 = newF0;
            f1 = newF1;
            f2 = newF2;
        }

        return Math.max(f1, f2);
    }
}
