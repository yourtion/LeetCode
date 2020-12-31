package com.yourtion.leetcode.easy.c9076;

/**
 * 9076. LCP 17. 速算机器人
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/nGK0Fy/
 */
public class Solution {
    public int calculate(String s) {
        int x = 1;
        int y = 0;
        for (char c : s.toCharArray()) {
            if (c == 'A') {
                x = 2 * x + y;
            }
            if (c == 'B') {
                y = 2 * y + x;
            }
        }
        return x + y;
    }
}
