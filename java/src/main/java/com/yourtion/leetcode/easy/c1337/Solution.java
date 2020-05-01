package com.yourtion.leetcode.easy.c1337;

import java.util.Arrays;

/**
 * 1337. 方阵中战斗力最弱的 K 行
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/the-k-weakest-rows-in-a-matrix/
 */
public class Solution {

    private int count(int[] row) {
        int c = 0;
        for (int a : row) {
            if (a == 0) {
                return c;
            }
            c += 1;
        }
        return c;
    }

    public int[] kWeakestRows(int[][] mat, int k) {
        int[][] map = new int[mat.length][2];
        for (int i = 0; i < mat.length; i++) {
            map[i] = new int[]{count(mat[i]), i};
        }
        Arrays.sort(map, (o1, o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o1[0] - o2[0]);
        int[] ret = new int[k];
        for (int i = 0; i < k; i++) {
            ret[i] = map[i][1];
        }
        return ret;
    }
}
