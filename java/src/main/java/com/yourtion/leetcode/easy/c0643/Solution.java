package com.yourtion.leetcode.easy.c0643;

/**
 * 643. 子数组最大平均数 I
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/maximum-average-subarray-i/
 */
public class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int ret = sum;
        int i = k;
        while (i < nums.length) {
            sum = sum + nums[i] - nums[i - k];
            ret = Math.max(ret, sum);
            i++;
        }
        return ret * 1.0 / k;
    }
}
