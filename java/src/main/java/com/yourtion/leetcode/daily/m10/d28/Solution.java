package com.yourtion.leetcode.daily.m10.d28;

/**
 * 1207. 独一无二的出现次数
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/unique-number-of-occurrences/
 */
public class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] map = new int[2000];
        for (int a : arr) {
            map[a + 1000] += 1;
        }
        int[] map2 = new int[arr.length];
        for (int c : map) {
            if (c == 0) {
                continue;
            }
            if (map2[c] > 0) {
                return false;
            }
            map2[c] += 1;
        }
        return true;
    }
}
