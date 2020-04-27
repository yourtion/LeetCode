package com.yourtion.leetcode.easy.c1260;

import java.util.ArrayList;
import java.util.List;

/**
 * 1260. 二维网格迁移
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/shift-2d-grid/
 */
public class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int[] arr = new int[m * n];
        int i = k % (m * n);
        for (int[] a : grid) {
            for (int b : a) {
                arr[i++] = b;
                if (i == arr.length) {
                    i = 0;
                }
            }
        }
        List<List<Integer>> ret = new ArrayList<>();
        i = 0;
        for (int j = 0; j < m; j++) {
            List<Integer> list = new ArrayList<>();
            for (int l = 0; l < n; l++) {
                list.add(arr[i++]);
            }
            ret.add(list);
        }
        return ret;
    }
}
