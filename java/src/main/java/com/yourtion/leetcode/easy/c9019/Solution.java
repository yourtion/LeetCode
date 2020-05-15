package com.yourtion.leetcode.easy.c9019;

import com.yourtion.leetcode.utils.TreeNode;

/**
 * 9019. 面试题 04.04. 检查平衡性
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/check-balance-lcci/
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
