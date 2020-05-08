package com.yourtion.leetcode.easy.c1440;

/**
 * 1440. LCP 01. 猜数字
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/guess-numbers/
 */
public class Solution {
    public int game(int[] guess, int[] answer) {
        int ret = 0;
        for (int i = 0; i < guess.length; i++) {
            ret += guess[i] == answer[i] ? 1 : 0;
        }
        return ret;
    }
}
