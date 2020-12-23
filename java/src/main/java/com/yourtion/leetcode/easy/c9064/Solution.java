package com.yourtion.leetcode.easy.c9064;

/**
 * 9064. 面试题53 - II. 0～n-1中缺失的数字
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/que-shi-de-shu-zi-lcof/
 */
public class Solution {
    public int missingNumber(int[] nums) {
        int ret = nums.length;
        for (int i = 0; i < nums.length; i++) {
            ret -= nums[i];
            ret += i;
        }
        return ret;
    }
}
