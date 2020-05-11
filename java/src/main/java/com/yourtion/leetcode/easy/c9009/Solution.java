package com.yourtion.leetcode.easy.c9009;

/**
 * 9009. 面试题 01.04. 回文排列
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/palindrome-permutation-lcci/
 */
public class Solution {
    public boolean canPermutePalindrome(String s) {
        int[] map = new int[256];
        for (char c : s.toCharArray()) {
            map[c] += 1;
        }
        int c = 0;
        for (int i : map) {
            if (i % 2 == 0) {
                continue;
            }
            c += 1;
            if (c > 1) {
                return false;
            }
        }
        return true;
    }
}
