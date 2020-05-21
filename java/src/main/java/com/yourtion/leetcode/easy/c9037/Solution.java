package com.yourtion.leetcode.easy.c9037;

/**
 * 9037. 面试题 17.04. 消失的数字
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/missing-number-lcci/
 */
public class Solution {
    public int missingNumber(int[] nums) {
        int sum = nums.length;
        for (int i = 0; i < nums.length; i++) {
            sum += i;
            sum -= nums[i];
        }
        return sum;
    }
}
