package com.yourtion.leetcode.easy.c1002;

import java.util.ArrayList;
import java.util.List;

/**
 * 1002. 查找常用字符
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/find-common-characters/
 */
public class Solution {
    public List<String> commonChars(String[] A) {
        List<String> ret = new ArrayList<>();
        int[] table = new int[26];
        for (char c : A[0].toCharArray()) {
            table[c - 'a'] += 1;
        }
        for (int i = 1; i < A.length; i++) {
            int[] map = new int[26];
            for (char c : A[i].toCharArray()) {
                map[c - 'a'] += 1;
            }
            for (int j = 0; j < map.length; j++) {
                table[j] = Math.min(table[j], map[j]);
            }
        }
        for (int i = 0; i < table.length; i++) {
            if (table[i] == 0) {
                continue;
            }
            for (int j = 0; j < table[i]; j++) {
                ret.add(String.valueOf((char) ('a' + i)));
            }
        }
        return ret;
    }
}
