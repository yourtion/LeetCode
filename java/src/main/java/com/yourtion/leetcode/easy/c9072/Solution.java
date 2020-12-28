package com.yourtion.leetcode.easy.c9072;

/**
 * 9072. 面试题 61. 扑克牌中的顺子
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/bu-ke-pai-zhong-de-shun-zi-lcof/
 */
public class Solution {
    public boolean isStraight(int[] nums) {
        boolean[] set = new boolean[14];
        int min = 14;
        int max = 0;
        for (int num : nums) {
            if (num == 0) {
                continue;
            }
            if (set[num]) {
                return false;
            }
            max = Math.max(max, num);
            min = Math.min(min, num);
            set[num] = true;
        }
        return max - min < 5;
    }
}
