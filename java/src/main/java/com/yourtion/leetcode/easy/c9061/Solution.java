package com.yourtion.leetcode.easy.c9061;

/**
 * 9061. 面试题50. 第一个只出现一次的字符
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/di-yi-ge-zhi-chu-xian-yi-ci-de-zi-fu-lcof/
 */
public class Solution {
    public char firstUniqChar(String s) {
        int[] map = new int[256];
        for (char c : s.toCharArray()) {
            map[c] += 1;
        }
        for (char c : s.toCharArray()) {
            if (map[c] == 1) {
                return c;
            }
        }
        return ' ';
    }
}
