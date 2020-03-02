package com.yourtion.leetcode.easy.c0485;

/**
 * 485. 最大连续1的个数
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/max-consecutive-ones/
 */
public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ret = 0;
        int count = 0;
        for (int n : nums) {
            if (n == 1) {
                count++;
            } else {
                ret = Math.max(ret, count);
                count = 0;
            }
        }
        return Math.max(ret, count);
    }
}
