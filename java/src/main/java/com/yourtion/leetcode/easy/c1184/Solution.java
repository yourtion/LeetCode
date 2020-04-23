package com.yourtion.leetcode.easy.c1184;

/**
 * 1184. 公交站间的距离
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/distance-between-bus-stops/
 */
public class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        if (start > destination) {
            return distanceBetweenBusStops(distance, destination, start);
        }
        int ret = Integer.MAX_VALUE;
        int d = 0;
        for (int i = start; i < destination; i++) {
            d += distance[i];
        }
        ret = Math.min(ret, d);
        d = 0;
        for (int i = destination; i < distance.length; i++) {
            d += distance[i];
        }
        for (int i = 0; i < start; i++) {
            d += distance[i];
        }
        ret = Math.min(ret, d);
        return ret;
    }
}
