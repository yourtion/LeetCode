package com.yourtion.leetcode.easy.c0874;

import java.util.HashSet;
import java.util.Set;

/**
 * 874. 模拟行走机器人
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/walking-robot-simulation/
 */
public class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        Set<String> set = new HashSet<>();
        for (int[] o : obstacles) {
            set.add(o[0] + "," + o[1]);
        }
        int ret = 0;
        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};
        int x = 0, y = 0, di = 0;
        for (int cmd : commands) {
            if (cmd == -2) {
                //left
                di = (di + 3) % 4;
            } else if (cmd == -1) {
                //right
                di = (di + 1) % 4;
            } else {
                for (int k = 0; k < cmd; ++k) {
                    int nx = x + dx[di];
                    int ny = y + dy[di];
                    if (!set.contains(nx + "," + ny)) {
                        x = nx;
                        y = ny;
                        ret = Math.max(ret, x * x + y * y);
                    }
                }
            }
        }
        return ret;
    }
}
