package com.yourtion.leetcode.easy.c0169;

import java.util.HashMap;
import java.util.Map;

/**
 * 169. 多数元素
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/majority-element/
 */
public class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(16);
        for (int n : nums) {
            map.putIfAbsent(n, 0);
            map.put(n, map.get(n) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > nums.length / 2) {
                return entry.getKey();
            }
        }
        return -1;
    }
}
