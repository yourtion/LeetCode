package com.yourtion.leetcode.easy.c9073;

/**
 * 9073. 面试题 65. 不用加减乘除做加法
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/bu-yong-jia-jian-cheng-chu-zuo-jia-fa-lcof/
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
