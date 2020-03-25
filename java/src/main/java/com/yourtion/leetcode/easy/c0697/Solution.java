package com.yourtion.leetcode.easy.c0697;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 697. 数组的度
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/degree-of-an-array/
 */
public class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> left = new HashMap<>(16);
        Map<Integer, Integer> right = new HashMap<>(16);
        Map<Integer, Integer> count = new HashMap<>(16);

        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            left.putIfAbsent(x, i);
            right.put(x, i);
            count.put(x, count.getOrDefault(x, 0) + 1);
        }

        int ans = nums.length;
        int degree = Collections.max(count.values());
        for (int x : count.keySet()) {
            if (count.get(x) == degree) {
                ans = Math.min(ans, right.get(x) - left.get(x) + 1);
            }
        }
        return ans;
    }
}
