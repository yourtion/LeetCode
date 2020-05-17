package com.yourtion.leetcode.easy.c9027;

/**
 * 9027. 面试题 08.03. 魔术索引
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/magic-index-lcci/
 */
public class Solution {
    public int findMagicIndex(int[] nums) {
        int ret = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == i) {
                return i;
            }
        }
        return ret;
    }
}
