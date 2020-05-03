package com.yourtion.leetcode.daily.m05.d03;

/**
 * 53. 最大子序和
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/maximum-subarray/
 */
public class Solution {
    public int maxSubArray(int[] nums) {
        int pre = 0;
        int res = nums[0];
        for (int v : nums) {
            pre = Math.max(pre + v, v);
            res = Math.max(res, pre);
        }
        return res;
    }
}
