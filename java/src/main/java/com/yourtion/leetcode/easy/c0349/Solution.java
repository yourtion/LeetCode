package com.yourtion.leetcode.easy.c0349;

import java.util.HashSet;
import java.util.Set;

/**
 * 349. 两个数组的交集
 *
 * @author yourtion
 * @link https://leetcode-cn.com/problems/intersection-of-two-arrays/
 */
public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        for (int n : nums1) {
            s1.add(n);
        }
        Set<Integer> s2 = new HashSet<>();
        for (int n : nums2) {
            if (s1.contains(n)) {
                s2.add(n);
            }
        }
        int[] ret = new int[s2.size()];
        int i = 0;
        for (Integer n : s2) {
            ret[i++] = n;
        }
        return ret;
    }
}
