package com.yourtion.leetcode.easy.c0292;

/**
 * 292. Nim 游戏
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/nim-game/
 */
public class Solution {
    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }
}
