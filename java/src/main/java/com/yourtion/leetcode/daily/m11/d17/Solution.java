package com.yourtion.leetcode.daily.m11.d17;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 1030. 距离顺序排列矩阵单元格
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/matrix-cells-in-distance-order/
 */
public class Solution {
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int[][] ret = new int[R * C][2];
        int cnt = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                ret[cnt][0] = i;
                ret[cnt][1] = j;
                ++cnt;
            }
        }
        Arrays.sort(ret, Comparator.comparingInt(o -> (Math.abs(o[0] - r0) + Math.abs(o[1] - c0))));
        return ret;
    }
}
