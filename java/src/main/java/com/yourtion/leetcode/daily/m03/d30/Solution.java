package com.yourtion.leetcode.daily.m03.d30;

/**
 * 面试题62. 圆圈中最后剩下的数字
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/yuan-quan-zhong-zui-hou-sheng-xia-de-shu-zi-lcof/
 */
public class Solution {
    public int lastRemaining(int n, int m) {
        int f = 0;
        for (int i = 2; i != n + 1; ++i) {
            f = (m + f) % i;
        }
        return f;
    }
}
