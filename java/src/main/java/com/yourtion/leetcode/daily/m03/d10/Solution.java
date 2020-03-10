package com.yourtion.leetcode.daily.m03.d10;

import com.yourtion.leetcode.utils.TreeNode;

/**
 * 543. 二叉树的直径
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/diameter-of-binary-tree/
 */
public class Solution {
    int ret = 1;

    int traverse(TreeNode n) {
        if (n == null) {
            return 0;
        }
        int l = traverse(n.left);
        int r = traverse(n.right);
        ret = Math.max(ret, l + r + +1);
        return Math.max(l, r) + 1;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        traverse(root);
        return ret - 1;
    }
}
