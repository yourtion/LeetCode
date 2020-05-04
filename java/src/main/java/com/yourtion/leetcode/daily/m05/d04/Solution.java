package com.yourtion.leetcode.daily.m05.d04;

/**
 * 45. 跳跃游戏 II
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/jump-game-ii/
 */
public class Solution {
    public int jump(int[] nums) {
        int position = nums.length - 1;
        int steps = 0;
        while (position > 0) {
            for (int i = 0; i < position; i++) {
                if (i + nums[i] >= position) {
                    position = i;
                    steps++;
                    break;
                }
            }
        }
        return steps;
    }
}
