package com.yourtion.leetcode.daily.m08.d23;

/**
 * 201. 数字范围按位与
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/bitwise-and-of-numbers-range/
 */
public class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        int shift = 0;
        // 找到公共前缀
        while (m < n) {
            m >>= 1;
            n >>= 1;
            ++shift;
        }
        return m << shift;
    }
}
