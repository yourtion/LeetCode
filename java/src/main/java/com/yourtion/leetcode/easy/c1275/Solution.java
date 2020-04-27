package com.yourtion.leetcode.easy.c1275;


/**
 * 1275. 找出井字棋的获胜者
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/find-winner-on-a-tic-tac-toe-game/
 */
public class Solution {
    private static final int[][][] M = {
            {{0, 0}, {0, 1}, {0, 2}},
            {{1, 0}, {1, 1}, {1, 2}},
            {{2, 0}, {2, 1}, {2, 2}},
            {{0, 0}, {1, 0}, {2, 0}},
            {{0, 1}, {1, 1}, {2, 1}},
            {{0, 2}, {1, 2}, {2, 2}},
            {{0, 0}, {1, 1}, {2, 2}},
            {{0, 2}, {1, 1}, {2, 0}},
    };

    private String getStrFromIndex(String[][] g, int[] i) {
        return g[i[0]][i[1]] == null ? "Pending" : g[i[0]][i[1]];
    }

    private String win(String[][] g) {
        int c = 0;
        for (int[][] k : M) {
            String k0 = getStrFromIndex(g, k[0]);
            String k1 = getStrFromIndex(g, k[1]);
            String k2 = getStrFromIndex(g, k[2]);
            if (k0.equals(k1) && k0.equals(k2)) {
                return k0;
            }
            c += "Pending".equals(k0) ? 0 : 1;
            c += "Pending".equals(k1) ? 0 : 1;
            c += "Pending".equals(k2) ? 0 : 1;
        }
        return c == 24 ? "Draw" : "Pending";
    }

    public String tictactoe(int[][] moves) {
        String[][] game = new String[3][3];
        String p = "A";
        for (int[] m : moves) {
            game[m[0]][m[1]] = p;
            p = "A".equals(p) ? "B" : "A";
        }
        return win(game);
    }
}
