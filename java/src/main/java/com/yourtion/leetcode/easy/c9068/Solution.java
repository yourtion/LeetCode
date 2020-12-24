package com.yourtion.leetcode.easy.c9068;

/**
 * 9068. 面试题 57. 和为s的两个数字
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/he-wei-sde-liang-ge-shu-zi-lcof/
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        while (i < nums.length) {
            int left = i;
            int right = nums.length;
            if (target > nums[i] + nums[right - 1]) {
                i += 1;
                continue;
            }
            while (left < right) {
                int mid = (left + right) >>> 1;
                if (target - nums[i] == nums[mid]) {
                    return new int[]{nums[i], nums[mid]};
                }
                if (nums[mid] > target - nums[i]) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }
            i += 1;
        }
        return new int[]{-1, -1};
    }
}
