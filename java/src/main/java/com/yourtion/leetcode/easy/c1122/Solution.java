package com.yourtion.leetcode.easy.c1122;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 1122. 数组的相对排序
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/relative-sort-array/
 */
public class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] ret = new int[arr1.length];
        Map<Integer, Integer> map = new HashMap<>(arr1.length);
        for (int a : arr1) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        int c = 0;
        for (int b : arr2) {
            int k = map.getOrDefault(b, 0);
            for (int i = 0; i < k; i++) {
                ret[c++] = b;
            }
            map.remove(b);
        }
        int b = c;
        for (int e : map.keySet()) {
            int k = map.getOrDefault(e, 0);
            for (int i = 0; i < k; i++) {
                ret[b++] = e;
            }
        }
        Arrays.sort(ret, c, arr1.length);
        return ret;
    }
}
