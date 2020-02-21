package com.yourtion.leetcode.easy.c0350;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 350. 两个数组的交集 II
 *
 * @author yourtion
 * @link https://leetcode-cn.com/problems/intersection-of-two-arrays-ii/
 */
public class Solution {

    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> m1 = new HashMap<>();
        for (int n : nums1) {
            m1.put(n, m1.getOrDefault(n, 0) + 1);
        }
        List<Integer> list = new ArrayList<>();
        for (int n : nums2) {
            Integer m = m1.getOrDefault(n, 0);
            if (m > 0) {
                m1.put(n, m - 1);
                list.add(n);
            }
        }
        int[] ret = new int[list.size()];
        int i = 0;
        for (Integer n : list) {
            ret[i++] = n;
        }
        return ret;
    }
}
