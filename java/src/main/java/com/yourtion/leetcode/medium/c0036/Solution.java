package com.yourtion.leetcode.medium.c0036;

import java.util.HashSet;
import java.util.Set;

/**
 * 36. 有效的数独
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/valid-sudoku/
 */
public class Solution {
    private static final int[] CELL = new int[]{1, 4, 7};
    private static final int[] CELL_K = new int[]{-1, 0, 1};
    Set<Character> set = new HashSet<>(9);

    private boolean unvaried(char c) {
        if (c == '.') {
            return false;
        }
        if (set.contains(c)) {
            return true;
        }
        set.add(c);
        return false;
    }

    private boolean validRow(char[][] board, int i) {
        set.clear();
        for (char c : board[i]) {
            if (unvaried(c)) {
                return false;
            }
        }
        return true;
    }

    private boolean validCol(char[][] board, int i) {
        set.clear();
        for (char[] chars : board) {
            char c = chars[i];
            if (unvaried(c)) {
                return false;
            }
        }
        return true;
    }

    private boolean validCell(char[][] board, int i, int j) {
        set.clear();
        for (int k : CELL_K) {
            for (int l : CELL_K) {
                char c = board[i + k][j + l];
                if (unvaried(c)) {
                    return false;
                }
            }
        }
        return true;
    }


    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            if (!validRow(board, i)) {
                return false;
            }
            if (!validCol(board, i)) {
                return false;
            }
        }
        for (int i : CELL) {
            for (int j : CELL) {
                if (!validCell(board, i, j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
