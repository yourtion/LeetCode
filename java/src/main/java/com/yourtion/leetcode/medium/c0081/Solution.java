package com.yourtion.leetcode.medium.c0081;

/**
 * 81. 搜索旋转排序数组 II
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/search-in-rotated-sorted-array-ii/
 */
public class Solution {
    public boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] == target) {
                return true;
            }
            if (nums[mid] < nums[right]) {
                //右部分有序
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else if (nums[mid] > nums[left]) {
                //左部分有序
                if (target < nums[mid] && target >= nums[left]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                //去重
                if (nums[left] == nums[mid]) {
                    left++;
                }
                if (nums[right] == nums[mid]) {
                    right--;
                }
            }
        }
        return false;
    }
}
