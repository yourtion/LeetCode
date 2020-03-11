package com.yourtion.leetcode.easy.c0594;

import java.util.HashMap;
import java.util.Map;

/**
 * 594. 最长和谐子序列
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/longest-harmonious-subsequence/
 */
public class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(32);
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int ret = 0;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (map.get(e.getKey() + 1) != null) {
                ret = Math.max(ret, e.getValue() + map.get(e.getKey() + 1));
            }
        }
        return ret;
    }
}
