package com.yourtion.leetcode.easy.c0219;

/**
 * 219. 存在重复元素 II
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/contains-duplicate-ii/
 */
public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < Math.min(i + k + 1, nums.length); j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
