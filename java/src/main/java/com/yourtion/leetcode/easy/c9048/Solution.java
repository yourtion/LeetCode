package com.yourtion.leetcode.easy.c9048;

/**
 * 9048. 面试题15. 二进制中1的个数
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/er-jin-zhi-zhong-1de-ge-shu-lcof/
 */
public class Solution {
    public int hammingWeight(int n) {
        return Integer.bitCount(n);
    }
}
