package com.yourtion.leetcode.daily.m11.d06;

import java.util.Arrays;

/**
 * 1356. 根据数字二进制下 1 的数目排序
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/sort-integers-by-the-number-of-1-bits/
 */
public class Solution {
    public int[] sortByBits(int[] arr) {
        int[] map = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            map[i] = Integer.bitCount(arr[i]) * 10000000 + arr[i];
        }
        Arrays.sort(map);
        for (int i = 0; i < map.length; i++) {
            map[i] = map[i] % 10000000;
        }
        return map;
    }
}
