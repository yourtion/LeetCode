package com.yourtion.leetcode.daily.m05.d26;

/**
 * 287. 寻找重复数
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/find-the-duplicate-number/
 */
public class Solution {
    public int findDuplicate(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int k = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == k) {
                    return nums[j];
                }
            }
        }
        return nums[0];
    }
}
