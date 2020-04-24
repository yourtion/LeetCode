package com.yourtion.leetcode.easy.c1189;

/**
 * 1189. “气球” 的最大数量
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/maximum-number-of-balloons/
 */
public class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] map = new int[26];
        int ret = 0;
        for (char c : text.toCharArray()) {
            map[c - 'a'] += 1;
        }
        while (true) {
            for (char c : "balloon".toCharArray()) {
                if (map[c - 'a'] > 0) {
                    map[c - 'a'] -= 1;
                } else {
                    return ret;
                }
            }
            ret += 1;
        }
    }
}
