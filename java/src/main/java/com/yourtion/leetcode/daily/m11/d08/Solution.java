package com.yourtion.leetcode.daily.m11.d08;

/**
 * 122. 买卖股票的最佳时机 II
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/
 */
public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length < 1) {
            return 0;
        }
        int ret = 0;
        int i = 0;
        int j = 1;
        while (i < prices.length - 1) {
            j = i + 1;
            if (prices[j] < prices[i]) {
                i += 1;
                continue;
            }
            while (j < prices.length) {
                if (prices[j] < prices[j - 1]) {
                    ret += prices[j - 1] - prices[i];
                    break;
                }
                if (j == prices.length - 1) {
                    ret += prices[j] - prices[i];
                }
                j += 1;
            }
            i = j;
        }
        return ret;
    }
}
