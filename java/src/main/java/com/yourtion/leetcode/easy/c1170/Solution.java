package com.yourtion.leetcode.easy.c1170;

/**
 * 1170. 比较字符串最小字母出现频次
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/compare-strings-by-frequency-of-the-smallest-character/
 */
public class Solution {

    private int getFeq(String w) {
        int[] arr = new int[26];
        for (char c : w.toCharArray()) {
            arr[c - 'a'] += 1;
        }
        for (int i : arr) {
            if (i > 0) {
                return i;
            }
        }
        return 0;
    }

    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] ret = new int[queries.length];
        int[] map = new int[11];
        for (String word : words) {
            int c = getFeq(word);
            while (c > 0) {
                c -= 1;
                map[c] += 1;
            }
        }
        for (int i = 0; i < queries.length; i++) {
            int q = getFeq(queries[i]);
            ret[i] = map[q];
        }

        return ret;
    }
}
