package com.yourtion.leetcode.easy.c0409;

/**
 * 409. 最长回文串
 *
 * @author yourtion
 * @link https://leetcode-cn.com/problems/longest-palindrome/
 */
public class Solution {
    public int longestPalindrome(String s) {
        int[] map = new int[128];
        for (char c : s.toCharArray()) {
            map[c]++;
        }
        int ret = 0;
        for (int i : map) {
            if (i == 0) {
                continue;
            }
            ret += i / 2 * 2;
            if (ret % 2 == 0 && i % 2 == 1) {
                ret += 1;
            }
        }
        return ret;
    }
}
