package com.yourtion.leetcode.easy.c0812;

/**
 * 812. 最大三角形面积
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/largest-triangle-area/
 */
public class Solution {
    private double area(int[] p1, int[] p2, int[] p3) {
        return 0.5 * Math.abs(p1[0] * p2[1] + p2[0] * p3[1] + p3[0] * p1[1]
                - p1[1] * p2[0] - p2[1] * p3[0] - p3[1] * p1[0]);
    }

    public double largestTriangleArea(int[][] points) {
        double ret = Double.MIN_VALUE;
        for (int i = 0; i < points.length - 2; i++) {
            for (int j = i + 1; j < points.length - 1; j++) {
                for (int k = j + 1; k < points.length; k++) {
                    double r = area(points[i], points[j], points[k]);
                    ret = Math.max(ret, r);
                }
            }
        }
        return ret;
    }
}
