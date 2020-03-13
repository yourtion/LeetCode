package com.yourtion.leetcode.daily.m03.d13;

/**
 * 169. 多数元素
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/majority-element/
 */
public class Solution {
    public int majorityElement(int[] nums) {
        int ret = nums[0];
        int c = 0;
        for (int n : nums) {
            if (c == 0) {
                ret = n;
            }
            c += n == ret ? 1 : -1;
        }
        return ret;
    }
}
