package com.yourtion.leetcode.easy.c0217;

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
        Map<Integer, Boolean> map = new HashMap<>(32);
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
