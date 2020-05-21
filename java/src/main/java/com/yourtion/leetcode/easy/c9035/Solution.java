package com.yourtion.leetcode.easy.c9035;

/**
 * 9035. 面试题 16.17. 连续数列
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/contiguous-sequence-lcci/
 */
public class Solution {
    public int maxSubArray(int[] nums) {
        int ret = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int res = 0;
            for (int j = i; j < nums.length; j++) {
                res += nums[j];
                ret = Math.max(ret, res);
            }
        }
        return ret;
    }
}
