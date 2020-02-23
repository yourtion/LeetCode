package com.yourtion.leetcode.easy.c0389;

/**
 * 389. 找不同
 *
 * @author yourtion
 * @link https://leetcode-cn.com/problems/find-the-difference/
 */
public class Solution {
    public char findTheDifference(String s, String t) {
        int[] table = new int[26];
        for (char c : s.toCharArray()) {
            table[c - 'a'] += 1;
        }
        for (char c : t.toCharArray()) {
            table[c - 'a'] -= 1;
        }
        for (int i = 0; i < table.length; i++) {
            if (table[i] == -1) {
                return (char) ('a' + i);
            }
        }
        return 'a';
    }
}
