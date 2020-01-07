package com.yourtion.leetcode.easy.c0035;

/**
 * 35. 搜索插入位置
 *
 * @author yourtion
 * @link https://leetcode-cn.com/problems/search-insert-position/
 */
public class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0 || target < nums[0]) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }
}