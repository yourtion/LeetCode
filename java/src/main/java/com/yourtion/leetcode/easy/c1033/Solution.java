package com.yourtion.leetcode.easy.c1033;

import java.util.Arrays;

/**
 * 1033. 移动石子直到连续
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/moving-stones-until-consecutive/
 */
public class Solution {
    public int[] numMovesStones(int a, int b, int c) {
        int[] r = new int[]{a, b, c};
        Arrays.sort(r);
        int min;
        if (r[2] - r[0] == 2) {
            min = 0;
        } else if (r[1] - r[0] == 1 || r[2] - r[1] == 1) {
            min = 1;
        } else if (r[1] - r[0] == 2 || r[2] - r[1] == 2) {
            min = 1;
        } else {
            min = 2;
        }
        return new int[]{min, r[2] - r[0] - 2};
    }
}
