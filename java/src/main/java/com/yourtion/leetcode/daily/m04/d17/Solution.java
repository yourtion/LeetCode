package com.yourtion.leetcode.daily.m04.d17;

/**
 * 55. 跳跃游戏
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/jump-game/
 */
public class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int rightmost = 0;
        for (int i = 0; i < n; ++i) {
            if (i <= rightmost) {
                rightmost = Math.max(rightmost, i + nums[i]);
                if (rightmost >= n - 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
