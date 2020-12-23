package com.yourtion.leetcode.easy.c9066;

import com.yourtion.leetcode.utils.TreeNode;

/**
 * 9066. 面试题55 - I. 二叉树的深度
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/er-cha-shu-de-shen-du-lcof/
 */
public class Solution {
    private int traverse(TreeNode n, int k) {
        if (n == null) {
            return k;
        }
        return Math.max(traverse(n.left, k + 1), traverse(n.right, k + 1));
    }

    public int maxDepth(TreeNode root) {
        return traverse(root, 0);
    }
}
