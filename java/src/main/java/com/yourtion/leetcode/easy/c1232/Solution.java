package com.yourtion.leetcode.easy.c1232;

/**
 * 1232. 缀点成线
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/check-if-it-is-a-straight-line/
 */
public class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int dx = Math.abs(coordinates[1][0] - coordinates[0][0]);
        int dy = Math.abs(coordinates[1][1] - coordinates[0][1]);
        double k = dx * 1.0 / dy;
        for (int i = 2; i < coordinates.length; i++) {
            int x = Math.abs(coordinates[i][0] - coordinates[i - 1][0]);
            int y = Math.abs(coordinates[i][1] - coordinates[i - 1][1]);
            if (k != (x * 1.0 / y)) {
                return false;
            }
        }
        return true;
    }
}
