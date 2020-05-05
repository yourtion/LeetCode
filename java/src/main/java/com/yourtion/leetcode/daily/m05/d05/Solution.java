package com.yourtion.leetcode.daily.m05.d05;

import com.yourtion.leetcode.utils.TreeNode;

/**
 * 98. 验证二叉搜索树
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/validate-binary-search-tree/
 */
public class Solution {
    private boolean isBST(TreeNode node, long lo, long hi) {
        if (node == null) {
            return true;
        }
        if (node.val <= lo || node.val >= hi) {
            return false;
        }
        return isBST(node.left, lo, node.val) && isBST(node.right, node.val, hi);
    }

    public boolean isValidBST(TreeNode root) {
        return isBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
}
