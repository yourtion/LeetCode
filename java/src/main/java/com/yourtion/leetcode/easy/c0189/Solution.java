package com.yourtion.leetcode.easy.c0189;

/**
 * 189. 旋转数组
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/rotate-array/
 */
public class Solution {
    public void rotate(int[] nums, int k) {
        if (nums.length < 1 || k < 1) {
            return;
        }
        k = k % nums.length;
        while (k > 0) {
            int tmp = nums[nums.length - 1];
            for (int i = 0; i < nums.length; i++) {
                int tmp2 = nums[i];
                nums[i] = tmp;
                tmp = tmp2;
            }
            k -= 1;
        }
    }
}
