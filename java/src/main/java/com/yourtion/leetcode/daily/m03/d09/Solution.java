package com.yourtion.leetcode.daily.m03.d09;

/**
 * 121. 买卖股票的最佳时机
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/
 */
public class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int ret = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (ret < price - minPrice) {
                ret = price - minPrice;
            }
        }
        return ret;
    }
}
