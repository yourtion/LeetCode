package com.yourtion.leetcode.medium.c0096;

/**
 * 96. 不同的二叉搜索树
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/unique-binary-search-trees/
 */
public class Solution {
    public int numTrees(int n) {
        long C = 1;
        for (int i = 0; i < n; ++i) {
            C = C * 2 * (2 * i + 1) / (i + 2);
        }
        return (int) C;
    }
}
