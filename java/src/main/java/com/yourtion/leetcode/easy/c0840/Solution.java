package com.yourtion.leetcode.easy.c0840;

/**
 * 840. 矩阵中的幻方
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/magic-squares-in-grid/
 */
public class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int rs = grid.length, cs = grid[0].length;
        int ans = 0;
        for (int r = 0; r < rs - 2; ++r) {
            for (int c = 0; c < cs - 2; ++c) {
                if (grid[r + 1][c + 1] != 5) {
                    continue;  // optional skip
                }
                if (magic(grid[r][c], grid[r][c + 1], grid[r][c + 2],
                        grid[r + 1][c], grid[r + 1][c + 1], grid[r + 1][c + 2],
                        grid[r + 2][c], grid[r + 2][c + 1], grid[r + 2][c + 2])) {
                    ans++;
                }
            }
        }

        return ans;
    }

    public boolean magic(int... vs) {
        int[] count = new int[16];
        for (int v : vs) {
            count[v]++;
        }
        for (int v = 1; v <= 9; ++v) {
            if (count[v] != 1) {
                return false;
            }
        }

        return (vs[0] + vs[1] + vs[2] == 15 &&
                vs[3] + vs[4] + vs[5] == 15 &&
                vs[6] + vs[7] + vs[8] == 15 &&
                vs[0] + vs[3] + vs[6] == 15 &&
                vs[1] + vs[4] + vs[7] == 15 &&
                vs[2] + vs[5] + vs[8] == 15 &&
                vs[0] + vs[4] + vs[8] == 15 &&
                vs[2] + vs[4] + vs[6] == 15);
    }
}
