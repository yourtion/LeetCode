package com.yourtion.leetcode.easy.c9060;

/**
 * 9060. 面试题42. 连续子数组的最大和
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/lian-xu-zi-shu-zu-de-zui-da-he-lcof/
 */
public class Solution {
    public int maxSubArray(int[] nums) {
        int pre = 0;
        int res = nums[0];
        for (int v : nums) {
            pre = Math.max(pre + v, v);
            res = Math.max(res, pre);
        }
        return res;
    }
}
