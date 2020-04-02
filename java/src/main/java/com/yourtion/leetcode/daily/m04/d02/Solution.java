package com.yourtion.leetcode.daily.m04.d02;

/**
 * 289. 生命游戏
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/game-of-life/
 */
public class Solution {
    public static final int LIVE = 1;
    public static final int DEAD = 0;
    public static final int LIVE_TO_DEAD = 2;
    public static final int DEAD_TO_LIVE = 3;

    private int calcLife(int[][] board, int i, int j) {
        int live = 0;
        int[] di = {-1, 0, 1, -1, 1, -1, 0, 1};
        int[] dj = {-1, -1, -1, 0, 0, 1, 1, 1};
        for (int index = 0; index < di.length; ++index) {
            int nextI = i + di[index], nextJ = j + dj[index];
            if (nextI < 0 || nextJ < 0 || nextI == board.length || nextJ == board[0].length) {
                continue;
            }
            int r = board[nextI][nextJ];
            if (r == LIVE || r == LIVE_TO_DEAD) {
                live += 1;
            }
        }
        int cur = board[i][j];
        if (cur == LIVE) {
            if (live < 2 || live > 3) {
                return LIVE_TO_DEAD;
            }
        } else {
            if (live == 3) {
                return DEAD_TO_LIVE;
            }
        }
        return cur;
    }

    public void gameOfLife(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = calcLife(board, i, j);
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == LIVE_TO_DEAD) {
                    board[i][j] = DEAD;
                } else if (board[i][j] == DEAD_TO_LIVE) {
                    board[i][j] = LIVE;
                }
            }
        }
    }
}
