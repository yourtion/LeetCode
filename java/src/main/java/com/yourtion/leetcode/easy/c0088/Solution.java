package com.yourtion.leetcode.easy.c0088;

/**
 * 88. 合并两个有序数组
 *
 * @author yourtion
 * @link https://leetcode-cn.com/problems/merge-sorted-array/
 */
public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        while (m > 0 || n > 0) {
            if (m > 0 && n > 0 && nums1[m - 1] > nums2[n - 1]) {
                nums1[m + n - 1] = nums1[m - 1];
                m -= 1;
            } else if (n > 0) {
                nums1[m + n - 1] = nums2[n - 1];
                n -= 1;
            } else {
                break;
            }
        }
    }
}