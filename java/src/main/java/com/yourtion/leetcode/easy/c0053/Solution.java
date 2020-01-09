package com.yourtion.leetcode.easy.c0053;

/**
 * 53. 最大子序和
 *
 * @author yourtion
 * @link https://leetcode-cn.com/problems/maximum-subarray/
 */
public class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length < 1) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int res = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int sum = nums[i];
            res = Math.max(sum, res);
            for (int j = i + 1; j < nums.length; j++) {
                sum += nums[j];
                res = Math.max(sum, res);
            }
        }
        return res;
    }
}
