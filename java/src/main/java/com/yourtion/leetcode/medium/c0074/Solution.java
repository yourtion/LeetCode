package com.yourtion.leetcode.medium.c0074;

/**
 * 74. 搜索二维矩阵
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/search-a-2d-matrix/
 */
public class Solution {
    private boolean search(int[] a, int target) {
        int left = 0;
        int right = a.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (a[mid] == target) {
                return true;
            }
            if (a[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        for (int[] k : matrix) {
            if (k.length < 1) {
                break;
            }
            if (k[0] <= target && k[k.length - 1] >= target) {
                if (search(k, target)) {
                    return true;
                }
            } else if (k[0] > target) {
                break;
            }
        }
        return false;
    }
}
