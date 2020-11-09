package com.yourtion.leetcode.daily.m11.d09;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 973. 最接近原点的 K 个点
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/k-closest-points-to-origin/
 */
public class Solution {
    public int[][] kClosest(int[][] points, int K) {
        Arrays.sort(points, Comparator.comparingInt(point -> (point[0] * point[0] + point[1] * point[1])));
        return Arrays.copyOfRange(points, 0, K);
    }
}
