package com.yourtion.leetcode.easy.c9036;

/**
 * 9036. 面试题 17.01. 不用加号的加法
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/add-without-plus-lcci/
 */
public class Solution {
    public int add(int a, int b) {
        while (b != 0) {
            int sum = (a ^ b);
            int carry = (a & b) << 1;
            a = sum;
            b = carry;
        }
        return a;
    }
}
