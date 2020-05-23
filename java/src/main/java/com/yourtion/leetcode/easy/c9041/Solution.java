package com.yourtion.leetcode.easy.c9041;

/**
 * 9041. 面试题04. 二维数组中的查找
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof/
 */
public class Solution {
    private boolean search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (right + left) / 2;
            if (nums[mid] == target) {
                return true;
            }
            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        for (int[] row : matrix) {
            if (row.length < 1 || target < row[0] || target > row[row.length - 1]) {
                continue;
            }
            for (int j = 0; j < row.length; j++) {
                if (search(row, target)) {
                    return true;
                }
            }
        }
        return false;
    }
}
