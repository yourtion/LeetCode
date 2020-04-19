package com.yourtion.leetcode.easy.c1051;

import java.util.Arrays;

/**
 * 1051. 高度检查器
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/height-checker/
 */
public class Solution {
    public int heightChecker(int[] heights) {
        int[] a = Arrays.copyOf(heights, heights.length);
        Arrays.sort(a);
        int ret = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != a[i]) {
                ret += 1;
            }
        }
        return ret;
    }
}
