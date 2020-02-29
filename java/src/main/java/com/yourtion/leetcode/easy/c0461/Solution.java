package com.yourtion.leetcode.easy.c0461;

/**
 * 461. 汉明距离
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/hamming-distance/
 */
public class Solution {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}
