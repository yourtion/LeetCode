package com.yourtion.leetcode.daily.m03.d24;

/**
 * 面试题 17.16. 按摩师
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/the-masseuse-lcci/
 */
public class Solution {
    public int massage(int[] nums) {
        int n = nums.length;
        if (n < 1) {
            return 0;
        }
        int dp0 = 0, dp1 = nums[0];

        for (int i = 1; i < n; ++i) {
            // 计算 dp[i][0]
            int tdp0 = Math.max(dp0, dp1);
            // 计算 dp[i][1]
            int tdp1 = dp0 + nums[i];

            // 用 dp[i][0] 更新 dp_0
            dp0 = tdp0;
            // 用 dp[i][1] 更新 dp_1
            dp1 = tdp1;
        }
        return Math.max(dp0, dp1);
    }
}
