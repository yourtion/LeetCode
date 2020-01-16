package com.yourtion.leetcode.easy.c0110;

import com.yourtion.leetcode.utils.TreeNode;

/**
 * 110. 平衡二叉树
 *
 * @author yourtion
 * @link https://leetcode-cn.com/problems/balanced-binary-tree/
 */
public class Solution {
    int depth(TreeNode node, int depth) {
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
