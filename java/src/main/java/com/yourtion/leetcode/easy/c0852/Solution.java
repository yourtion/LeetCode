package com.yourtion.leetcode.easy.c0852;

/**
 * 852. 山脉数组的峰顶索引
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/peak-index-in-a-mountain-array/
 */
public class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int ret = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] < ret) {
                break;
            }
            index = i;
            ret = A[i];
        }
        return index;
    }
}
