package com.yourtion.leetcode.easy.c1331;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 1331. 数组序号转换
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/rank-transform-of-an-array/
 */
public class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] sorted = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sorted);
        Map<Integer, Integer> map = new HashMap<>(sorted.length);
        int c = 1;
        for (int i : sorted) {
            if (!map.containsKey(i)) {
                map.put(i, c++);
            }
        }
        for (int i = 0; i < sorted.length; i++) {
            sorted[i] = map.getOrDefault(arr[i], 0);
        }
        return sorted;
    }
}
