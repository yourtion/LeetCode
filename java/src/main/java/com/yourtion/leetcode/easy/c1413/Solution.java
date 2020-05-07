package com.yourtion.leetcode.easy.c1413;

/**
 * 1413. 逐步求和得到正数的最小值
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/minimum-value-to-get-positive-step-by-step-sum/
 */
public class Solution {
    public int minStartValue(int[] nums) {
        int i = 0;
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            i += n;
            min = Math.min(min, i);
        }
        return min >= 1 ? 1 : Math.abs(min) + 1;
    }
}
