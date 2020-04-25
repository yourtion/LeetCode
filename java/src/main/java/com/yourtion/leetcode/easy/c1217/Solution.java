package com.yourtion.leetcode.easy.c1217;

/**
 * 1217. 玩筹码
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/play-with-chips/
 */
public class Solution {
    public int minCostToMoveChips(int[] chips) {
        if (chips.length == 0) {
            return 0;
        }

        int odd = 0;
        int even = 0;

        for (int k : chips) {
            if (k % 2 == 0) {
                odd += 1;
            } else {
                even += 1;
            }
        }
        return Math.min(odd, even);
    }
}
