package com.yourtion.leetcode.medium.c0079;

/**
 * 79. 单词搜索
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/word-search/
 */
public class Solution {
    private static final int[][] DIRECTION = {{-1, 0}, {0, -1}, {0, 1}, {1, 0}};
    private boolean[][] marked;
    private char[][] board;
    private char[] chars;
    private int m;
    private int n;

    private boolean inArea(int x, int y) {
        return x >= 0 && x < m && y >= 0 && y < n;
    }

    private boolean search(int i, int j, int start) {
        if (start == chars.length - 1) {
            return board[i][j] == chars[start];
        }
        if (board[i][j] == chars[start]) {
            marked[i][j] = true;
            for (int[] dis : DIRECTION) {
                int newX = i + dis[0];
                int newY = j + dis[1];
                if (inArea(newX, newY) && !marked[newX][newY] && search(newX, newY, start + 1)) {
                    return true;
                }
            }
            marked[i][j] = false;
        }
        return false;
    }

    public boolean exist(char[][] board, String word) {
        this.board = board;
        m = board.length;
        n = board[0].length;
        marked = new boolean[m][n];
        this.chars = word.toCharArray();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (search(i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }
}
