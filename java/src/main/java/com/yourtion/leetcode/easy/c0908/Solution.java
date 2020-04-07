package com.yourtion.leetcode.easy.c0908;

/**
 * 908. 最小差值 I
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/smallest-range-i/
 */
public class Solution {
    public int smallestRangeI(int[] A, int K) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int a : A) {
            max = Math.max(max, a);
            min = Math.min(min, a);
        }
        int d = max - min;
        return Math.max(0, d - 2 * K);
    }
}
