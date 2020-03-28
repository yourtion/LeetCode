package com.yourtion.leetcode.easy.c0788;

/**
 * 788. 旋转数字
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/rotated-digits/
 */
public class Solution {
    public int rotatedDigits(int N) {
        int ret = 0;
        for (int n = 1; n <= N; ++n) {
            if (good(n, false)) {
                ret++;
            }
        }
        return ret;
    }

    public boolean good(int n, boolean flag) {
        if (n == 0) {
            return flag;
        }

        int d = n % 10;
        if (d == 3 || d == 4 || d == 7) {
            return false;
        }
        if (d == 0 || d == 1 || d == 8) {
            return good(n / 10, flag);
        }
        return good(n / 10, true);
    }
}
