package com.yourtion.leetcode.easy.c0747;

/**
 * 747. 至少是其他数字两倍的最大数
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/largest-number-at-least-twice-of-others/
 */
public class Solution {
    public int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE;
        int secMax = max;
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (n > max) {
                secMax = max;
                max = n;
                index = i;
            } else if (n > secMax) {
                secMax = n;
            }
        }
        return secMax * 2 <= max ? index : -1;
    }
}
