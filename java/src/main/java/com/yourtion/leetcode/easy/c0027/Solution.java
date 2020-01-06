package com.yourtion.leetcode.easy.c0027;

/**
 * 27. 移除元素
 *
 * @author yourtion
 * @link https://leetcode-cn.com/problems/remove-element/
 */
public class Solution {
    public int removeElement(int[] nums, int val) {
        int p = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[p] = nums[i];
                p += 1;
            }
        }
        return p;
    }
}