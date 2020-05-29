package com.yourtion.leetcode.medium.c0034;

/**
 * 34. 在排序数组中查找元素的第一个和最后一个位置
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 */
public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                left = mid;
                while (left > 0 && nums[left - 1] == target) {
                    left -= 1;
                }
                right = mid;
                while (right < nums.length - 1 && nums[right + 1] == target) {
                    right += 1;
                }
                return new int[]{left, right};
            }
            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return new int[]{-1, -1};
    }
}
