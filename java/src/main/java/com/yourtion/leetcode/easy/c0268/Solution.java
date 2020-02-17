package com.yourtion.leetcode.easy.c0268;

/**
 * 268. 缺失数字
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/missing-number/
 */
public class Solution {
    public int missingNumber(int[] nums) {
        int max = 0;
        int ret = 0;
        for (int n : nums) {
            ret ^= n;
            max = Math.max(n, max);
        }
        if (max < nums.length) {
            return nums.length;
        }
        for (int i = 0; i <= max; i++) {
            ret ^= i;
        }
        return ret;
    }
}
