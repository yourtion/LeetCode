package com.yourtion.leetcode.daily.m09.d01;

/**
 * 486. 预测赢家
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/predict-the-winner/
 */
public class Solution {
    public boolean PredictTheWinner(int[] nums) {
        int length = nums.length;
        int[] dp = new int[length];
        System.arraycopy(nums, 0, dp, 0, length);
        for (int i = length - 2; i >= 0; i--) {
            for (int j = i + 1; j < length; j++) {
                dp[j] = Math.max(nums[i] - dp[j], nums[j] - dp[j - 1]);
            }
        }
        return dp[length - 1] >= 0;
    }
}
