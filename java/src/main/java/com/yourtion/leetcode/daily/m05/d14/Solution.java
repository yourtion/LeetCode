package com.yourtion.leetcode.daily.m05.d14;

/**
 * 136. 只出现一次的数字
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/single-number/
 */
public class Solution {
    public int singleNumber(int[] nums) {
        int k = 0;
        for (int i : nums) {
            k ^= i;
        }
        return k;
    }
}
