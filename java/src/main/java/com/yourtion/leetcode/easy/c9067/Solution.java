package com.yourtion.leetcode.easy.c9067;

import com.yourtion.leetcode.utils.TreeNode;

/**
 * 9067. 面试题 55 - II. 平衡二叉树
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/ping-heng-er-cha-shu-lcof/
 */
public class Solution {
    private int depth(TreeNode node, int depth) {
        if (node == null) {
            return depth;
        }
        depth += 1;
        if (node.left == null && node.right == null) {
            return depth;
        }
        return Math.max(depth(node.left, depth), depth(node.right, depth));
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        boolean ok = Math.abs(depth(root.left, 1) - depth(root.right, 1)) <= 1;
        if (!ok) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }
}
