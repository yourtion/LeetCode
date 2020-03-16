package com.yourtion.leetcode.easy.c0657;

/**
 * 657. 机器人能否返回原点
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/robot-return-to-origin/
 */
public class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        for (char c : moves.toCharArray()) {
            switch (c) {
                case 'U':
                    y -= 1;
                    break;
                case 'D':
                    y += 1;
                    break;
                case 'L':
                    x -= 1;
                    break;
                case 'R':
                    x += 1;
                    break;
                default:
            }
        }
        return x == 0 && y == 0;
    }
}
