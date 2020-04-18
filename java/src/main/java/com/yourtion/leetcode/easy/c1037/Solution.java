package com.yourtion.leetcode.easy.c1037;

/**
 * 1037. 有效的回旋镖
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/valid-boomerang/
 */
public class Solution {
    public boolean isBoomerang(int[][] points) {
        int[] p1 = points[0];
        int[] p2 = points[1];
        int[] p3 = points[2];
        return (p2[1] - p1[1]) * (p3[0] - p1[0]) != (p3[1] - p1[1]) * (p2[0] - p1[0]);
    }
}
