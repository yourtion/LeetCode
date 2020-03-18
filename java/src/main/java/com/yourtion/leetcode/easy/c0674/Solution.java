package com.yourtion.leetcode.easy.c0674;

/**
 * 674. 最长连续递增序列
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/longest-continuous-increasing-subsequence/
 */
public class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int cur = Integer.MIN_VALUE;
        int ret = 0;
        int c = 0;
        for (int n : nums) {
            if (n > cur) {
                c++;
            } else {
                ret = Math.max(ret, c);
                c = 1;
            }
            cur = n;
        }
        return Math.max(ret, c);
    }
}
