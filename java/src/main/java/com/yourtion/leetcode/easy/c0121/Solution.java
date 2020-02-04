package com.yourtion.leetcode.easy.c0121;

/**
 * 121. 买卖股票的最佳时机
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/
 */
class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length < 1) {
            return 0;
        }
        int ret = 0;
        int buyPrice = prices[0];
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] > buyPrice) {
                continue;
            }
            for (int j = i + 1; j < prices.length; j++) {
                ret = Math.max(ret, prices[j] - prices[i]);
            }
        }
        return ret;
    }
}