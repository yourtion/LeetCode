package com.yourtion.leetcode.daily.m04.d23;

/**
 * 面试题 08.11. 硬币
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/coin-lcci/
 */
public class Solution {
    private static final int MOD = 1000000007;
    private static final int[] COINS = {25, 10, 5, 1};

    public int waysToChange(int n) {
        int[] f = new int[n + 1];
        f[0] = 1;
        for (int c = 0; c < 4; ++c) {
            int coin = COINS[c];
            for (int i = coin; i <= n; ++i) {
                f[i] = (f[i] + f[i - coin]) % MOD;
            }
        }
        return f[n];
    }
}
