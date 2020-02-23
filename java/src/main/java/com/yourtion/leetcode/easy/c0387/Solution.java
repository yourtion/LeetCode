package com.yourtion.leetcode.easy.c0387;

/**
 * 387. 字符串中的第一个唯一字符
 *
 * @author yourtion
 * @link https://leetcode-cn.com/problems/first-unique-character-in-a-string/
 */
public class Solution {

    public int firstUniqChar(String s) {
        int[] table = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (table[c - 'a'] < 1 && s.indexOf(c, i + 1) == -1) {
                return i;
            }
            table[c - 'a'] = 1;
        }
        return -1;
    }

}
