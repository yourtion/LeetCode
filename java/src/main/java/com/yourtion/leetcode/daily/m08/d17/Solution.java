package com.yourtion.leetcode.daily.m08.d17;

import com.yourtion.leetcode.utils.TreeNode;

/**
 * 110. 平衡二叉树
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/balanced-binary-tree/
 */
public class Solution {
    private int treeHeight(TreeNode node, int h) {
        if (node == null) {
            return h;
        }
        return Math.max(treeHeight(node.left, h + 1), treeHeight(node.right, h + 1));
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (Math.abs(treeHeight(root.left, 1) - treeHeight(root.right, 1)) > 1) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }
}
