package com.yourtion.leetcode.daily.m07.d17;

/**
 * 35. 搜索插入位置
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/search-insert-position/
 */
public class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int left = 0, right = n - 1, ans = n;
        while (left <= right) {
            int mid = ((right - left) >> 1) + left;
            if (target <= nums[mid]) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
