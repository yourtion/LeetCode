package com.yourtion.leetcode.daily.m03.d08;

import java.util.HashMap;
import java.util.Map;

/**
 * 322. 零钱兑换
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/coin-change/
 */
public class Solution {
    private Map<Integer, Integer> memo = new HashMap<>(32);

    int dp(int[] coins, int amount) {
        if (memo.get(amount) != null) {
            return memo.get(amount);
        }
        if (amount == 0) {
            return 0;
        }
        if (amount < 0) {
            return -1;
        }
        int res = Integer.MAX_VALUE;
        for (int c : coins) {
            int r = dp(coins, amount - c);
            if (r == -1) {
                continue;
            }
            res = Math.min(res, r + 1);
        }
        memo.put(amount, res == Integer.MAX_VALUE ? -1 : res);
        return memo.get(amount);
    }

    public int coinChange(int[] coins, int amount) {
        return dp(coins, amount);
    }
}
