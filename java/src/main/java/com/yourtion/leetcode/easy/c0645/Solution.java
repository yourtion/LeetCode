package com.yourtion.leetcode.easy.c0645;

/**
 * 645. 错误的集合
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/set-mismatch/
 */
public class Solution {
    public int[] findErrorNums(int[] nums) {
        int dup = -1, missing = 1;
        for (int n : nums) {
            if (nums[Math.abs(n) - 1] < 0) {
                dup = Math.abs(n);
            } else {
                nums[Math.abs(n) - 1] *= -1;
            }
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > 0) {
                missing = i + 1;
            }
        }
        return new int[]{dup, missing};
    }
}
