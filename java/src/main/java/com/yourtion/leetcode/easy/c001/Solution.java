package com.yourtion.leetcode.easy.c001;

/**
 * 1. 两数之和
 *
 * @author yourtion
 * @link https://leetcode-cn.com/problems/two-sum/
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0, 0};
    }
}