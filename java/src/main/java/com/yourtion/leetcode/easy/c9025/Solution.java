package com.yourtion.leetcode.easy.c9025;

/**
 * 9025. 面试题 08.01. 三步问题
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/three-steps-problem-lcci/
 */
public class Solution {
    public int waysToStep(int n) {
        if (n <= 2) {
            return n;
        }
        int a = 1, b = 2, c = 4, d = 4;
        for (int i = 4; i <= n; i++) {
            d = ((a + b) % 1000000007 + c) % 1000000007;
            a = b;
            b = c;
            c = d;
        }
        return d % 1000000007;
    }
}
