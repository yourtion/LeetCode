package com.yourtion.leetcode.daily.m12.d29;

/**
 * 330. 按要求补齐数组
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/patching-array/
 */
public class Solution {
    public int minPatches(int[] nums, int n) {
        int patches = 0;
        long x = 1;
        int length = nums.length, index = 0;
        while (x <= n) {
            if (index < length && nums[index] <= x) {
                x += nums[index];
                index++;
            } else {
                x *= 2;
                patches++;
            }
        }
        return patches;
    }
}
