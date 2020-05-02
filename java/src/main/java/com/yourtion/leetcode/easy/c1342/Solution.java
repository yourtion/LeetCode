package com.yourtion.leetcode.easy.c1342;

/**
 * 1342. 将数字变成 0 的操作次数
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/number-of-steps-to-reduce-a-number-to-zero/
 */
public class Solution {
    public int numberOfSteps(int num) {
        int c = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
            c += 1;
        }
        return c;
    }
}
