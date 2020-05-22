package com.yourtion.leetcode.easy.c9040;

/**
 * 9040. 面试题03. 数组中重复的数字
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/
 */
public class Solution {
    public int findRepeatNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[Math.abs(nums[i])] < 0) {
                return Math.abs(nums[i]);
            }
            nums[Math.abs(nums[i])] = -1 * nums[Math.abs(nums[i])];
        }
        return 0;
    }
}
