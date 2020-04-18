package com.yourtion.leetcode.easy.c1042;

import java.util.HashSet;
import java.util.Set;

/**
 * 1042. 不邻接植花
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/flower-planting-with-no-adjacent/
 */
public class Solution {
    public int[] gardenNoAdj(int N, int[][] paths) {
        int[][] table = new int[N][N];
        for (int[] p : paths) {
            table[p[0] - 1][p[1] - 1] = -1;
            table[p[1] - 1][p[0] - 1] = -1;
        }
        int[] ret = new int[N];
        Set<Integer> set = new HashSet<>(4);
        for (int i = 0; i < N; ++i) {
            if (ret[i] > 0) {
                continue;
            }
            set.clear();
            for (int j = 0; j < N; ++j) {
                if (table[i][j] != -1) {
                    continue;
                }
                if (ret[j] == 0) {
                    continue;
                }
                set.add(ret[j]);
            }
            for (int j = 1; j < 5; j++) {
                if (set.contains(j)) {
                    continue; //B
                }
                ret[i] = j;
                break;
            }
        }
        return ret;
    }
}
