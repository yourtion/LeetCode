package com.yourtion.leetcode.daily.m05.d15;

/**
 * 560. 和为K的子数组
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/subarray-sum-equals-k/
 */
public class Solution {
    public int subarraySum(int[] nums, int k) {
        int ret = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = k;
            for (int j = i; j < nums.length; j++) {
                sum -= nums[j];
                if (sum == 0) {
                    ret += 1;
                }
            }
        }
        return ret;
    }
}
