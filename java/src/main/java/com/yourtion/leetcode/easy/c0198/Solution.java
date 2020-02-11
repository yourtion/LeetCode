package com.yourtion.leetcode.easy.c0198;

/**
 * 198. 打家劫舍
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/house-robber/
 */
public class Solution {
    public int rob(int[] nums) {
        int pre = 0;
        int res = 0;
        for (int i : nums) {
            int tmp = res;
            res = Math.max(pre + i, res);
            pre = tmp;
        }
        return res;
    }
}
