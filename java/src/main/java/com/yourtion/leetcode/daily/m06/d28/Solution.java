package com.yourtion.leetcode.daily.m06.d28;

/**
 * 209. 长度最小的子数组
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/minimum-size-subarray-sum/
 */
public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        int ret = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= s) {
                ret = Math.min(ret, i + 1);
            }
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] - nums[i] >= s) {
                    ret = Math.min(ret, j - i);
                    break;
                }
            }
        }
        return ret == Integer.MAX_VALUE ? 0 : ret;
    }
}
