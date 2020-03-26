package com.yourtion.leetcode.daily.m03.d26;

/**
 * 999. 车的可用捕获量
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/available-captures-for-rook/
 */
public class Solution {
    public int numRookCaptures(char[][] board) {
        int ret = 0, st = 0, ed = 0;
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        for (int i = 0; i < 8; ++i) {
            for (int j = 0; j < 8; ++j) {
                if (board[i][j] == 'R') {
                    st = i;
                    ed = j;
                    break;
                }
            }
        }
        for (int i = 0; i < 4; ++i) {
            for (int step = 0; ; ++step) {
                int tx = st + step * dx[i];
                int ty = ed + step * dy[i];
                if (tx < 0 || tx >= 8 || ty < 0 || ty >= 8 || board[tx][ty] == 'B') {
                    break;
                }
                if (board[tx][ty] == 'p') {
                    ret++;
                    break;
                }
            }
        }
        return ret;
    }
}
