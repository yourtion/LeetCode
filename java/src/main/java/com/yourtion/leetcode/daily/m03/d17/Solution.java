package com.yourtion.leetcode.daily.m03.d17;

import java.util.Arrays;

/**
 * 1160. 拼写单词
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/find-words-that-can-be-formed-by-characters/
 */
public class Solution {
    public int countCharacters(String[] words, String chars) {
        int ret = 0;
        int[] table = new int[26];
        for (String word : words) {
            Arrays.fill(table, 0);
            boolean ok = true;
            for (char c : word.toCharArray()) {
                int p = c - 'a';
                int i = chars.indexOf(c, table[p]);
                if (i == -1) {
                    ok = false;
                    break;
                }
                table[p] = i + 1;
            }
            if (ok) {
                ret += word.length();
            }
        }
        return ret;
    }
}
