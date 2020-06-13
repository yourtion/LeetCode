package com.yourtion.leetcode.daily.m06.d13;

/**
 * 70. 爬楼梯
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/climbing-stairs/
 */
public class Solution {
    private int[] memo;

    private int climb(int i, int n) {
        if (i > n) {
            return 0;
        }
        if (i == n) {
            return 1;
        }
        if (memo[i] > 0) {
            return memo[i];
        }
        memo[i] = climb(i + 1, n) + climb(i + 2, n);
        return memo[i];
    }

    public int climbStairs(int n) {
        memo = new int[n + 1];
        return climb(0, n);
    }
}
