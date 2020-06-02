package com.yourtion.leetcode.daily.m06.d02;

/**
 * 面试题64. 求1+2+…+n
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/qiu-12n-lcof/
 */
public class Solution {
    public int sumNums(int n) {
        boolean flag = n > 0 && (n += sumNums(n - 1)) > 0;
        return n;
    }
}
