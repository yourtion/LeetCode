package com.yourtion.leetcode.easy.c1266;

/**
 * 1266. 访问所有点的最小时间
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/minimum-time-visiting-all-points/
 */
public class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int x0 = points[0][0];
        int y0 = points[0][1];
        int ret = 0;
        for (int i = 1; i < points.length; i++) {
            int x = points[i][0];
            int y = points[i][1];
            ret += Math.max(Math.abs(x0 - x), Math.abs(y0 - y));
            x0 = x;
            y0 = y;
        }
        return ret;
    }
}
