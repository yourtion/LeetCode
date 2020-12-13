package com.yourtion.leetcode.daily.m12.d13;

import java.util.HashMap;
import java.util.Map;

/**
 * 217. 存在重复元素
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/contains-duplicate/
 */
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Boolean> map = new HashMap<>(nums.length);
        for (int n : nums) {
            if (map.get(n) != null) {
                return true;
            } else {
                map.put(n, true);
            }
        }
        return false;
    }
}
