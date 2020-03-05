package com.yourtion.leetcode.easy.c0521;

/**
 * 521. 最长特殊序列 Ⅰ
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/longest-uncommon-subsequence-i/
 */
public class Solution {
    public int findLUSlength(String a, String b) {
        if (a.equals(b)) {
            return -1;
        }
        return Math.max(a.length(), b.length());

    }
}
