package com.yourtion.leetcode.daily.m11.d19;

/**
 * 283. 移动零
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/move-zeroes/
 */
public class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        while (n > 0) {
            if (nums[n - 1] != 0) {
                n -= 1;
                continue;
            }
            for (int i = n - 1; i < nums.length - 1; i++) {
                nums[i] = nums[i + 1];
                // 遇到末尾的0就不需要再移动
                if (nums[i + 1] == 0) {
                    nums[i] = 0;
                    break;
                }
                // 处理第一次遇到0
                if (i + 1 == nums.length - 1) {
                    nums[i + 1] = 0;
                }
            }
            n -= 1;
        }
    }
}
