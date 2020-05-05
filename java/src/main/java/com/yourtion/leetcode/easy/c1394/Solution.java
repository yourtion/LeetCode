package com.yourtion.leetcode.easy.c1394;

/**
 * 1394. 找出数组中的幸运数
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/find-lucky-integer-in-an-array/
 */
public class Solution {
    public int findLucky(int[] arr) {
        int[] map = new int[500];
        int max = 0;
        for (int a : arr) {
            map[a] += 1;
            max = Math.max(max, map[a]);
        }
        for (int i = max; i > 0; i--) {
            if (map[i] == i) {
                return i;
            }
        }
        return -1;
    }
}
