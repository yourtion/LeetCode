package com.yourtion.leetcode.easy.c9007;

/**
 * 9007. 面试题 01.02. 判定是否互为字符重排
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/check-permutation-lcci/
 */
public class Solution {
    public boolean CheckPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int[] map = new int[256];
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        for (int i = 0; i < a1.length; i++) {
            map[a1[i]] += 1;
            map[a2[i]] -= 1;
        }
        for (int value : map) {
            if (value != 0) {
                return false;
            }
        }
        return true;
    }
}
