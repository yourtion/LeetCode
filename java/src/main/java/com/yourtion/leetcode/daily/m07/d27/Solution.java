package com.yourtion.leetcode.daily.m07.d27;

/**
 * 392. 判断子序列
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/is-subsequence/
 */
public class Solution {
    private int[][] getSourceMap(String t) {
        // 计算字符数量
        int[] counter = new int[26];
        for (char tt : t.toCharArray()) {
            counter[tt - 'a'] += 1;
        }
        // 初始化map
        int[][] map = new int[26][];
        for (int i = 0; i < counter.length; i++) {
            map[i] = new int[counter[i]];
            counter[i] = 0;
        }
        // 插入map数据
        for (int i = 0; i < t.length(); i++) {
            int index = t.charAt(i) - 'a';
            map[index][counter[index]] = i;
            counter[index] += 1;
        }
        return map;
    }

    private int getIndex(int[] ints, int index) {
        // 这部分查找可以用二分法，提高效率
        for (int i : ints) {
            if (i > index) {
                index = i;
                break;
            }
        }
        return index;
    }

    public boolean isSubsequence(String s, String t) {
        int[][] map = getSourceMap(t);

        int index = -1;
        for (char ss : s.toCharArray()) {
            int ii = index;
            index = getIndex(map[ss - 'a'], index);
            if (index == ii) {
                return false;
            }
        }
        return true;
    }
}
