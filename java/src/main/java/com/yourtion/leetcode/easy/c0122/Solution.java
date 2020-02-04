package com.yourtion.leetcode.easy.c0122;

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
        while (i < prices.length - 1) {
            int buyPrice = prices[i];
            int j = i + 1;
            // 如果后面的值`j`比当前买入价格i还小，则`i`继续累加
            if (prices[j] < prices[i]) {
                i += 1;
                continue;
            }
            while (j < prices.length) {
                // 如果当前值比之前的值小，那么就在上一次卖出，累计收益
                if (prices[j] < prices[j - 1]) {
                    ret += prices[j - 1] - buyPrice;
                    break;
                }
                // 记得处理最后一个位置卖出的情况
                if (j == prices.length - 1) {
                    ret += prices[j] - buyPrice;
                }
                // 同时把`i`买入指针置为当前位置
                j += 1;
            }
            i = j;
        }
        return ret;
    }
}

