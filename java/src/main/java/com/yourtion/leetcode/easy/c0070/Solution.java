package com.yourtion.leetcode.easy.c0070;

/**
 * 70. 爬楼梯
 *
 * @author yourtion
 * @link https://leetcode-cn.com/problems/climbing-stairs/
 */
public class Solution {
    int climb(int i, int n, int[] memo) {
        if (i > n) {
            return 0;
        }
        if (i == n) {
            return 1;
        }
        if (memo[i] > 0) {
            return memo[i];
        }
        memo[i] = climb(i + 1, n, memo) + climb(i + 2, n, memo);
        return memo[i];
    }

    public int climbStairs(int n) {
        int[] memo = new int[n + 1];
        return climb(0, n, memo);
    }
}