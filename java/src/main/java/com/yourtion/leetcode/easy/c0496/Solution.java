package com.yourtion.leetcode.easy.c0496;

import java.util.HashMap;
import java.util.Map;

/**
 * 496. 下一个更大元素 I
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/next-greater-element-i/
 */
public class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>(nums2.length);
        for (int i = 0; i < nums2.length; i++) {
            int n = nums2[i];
            int r = -1;
            for (int j = i + 1; j < nums2.length; j++) {
                if (nums2[j] > n) {
                    r = nums2[j];
                    break;
                }
            }
            map.put(n, r);
        }
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = map.getOrDefault(nums1[i], -1);
        }
        return nums1;
    }
}
