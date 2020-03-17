package com.yourtion.leetcode.easy.c0665;

/**
 * 665. 非递减数列
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/non-decreasing-array/
 */
public class Solution {
    public boolean checkPossibility(int[] nums) {
        int count = 0, temp = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length - 1; i++) {
            // 出现不满足非递减的情况
            if (nums[i] > nums[i + 1]) {
                // 第二次出现非递减时直接返回false
                if (count++ > 0) {
                    return false;
                }
                if (nums[i + 1] < temp) {
                    nums[i + 1] = nums[i];
                } else {
                    nums[i] = temp;
                }
            }
            temp = nums[i];
        }
        return true;
    }
}
