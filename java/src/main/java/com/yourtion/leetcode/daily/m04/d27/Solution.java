package com.yourtion.leetcode.daily.m04.d27;

/**
 * 33. 搜索旋转排序数组
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/search-in-rotated-sorted-array/
 */
public class Solution {
    public int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
