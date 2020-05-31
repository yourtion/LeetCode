package com.yourtion.leetcode.daily.m05.d31;

import com.yourtion.leetcode.utils.TreeNode;

/**
 * 101. 对称二叉树
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/symmetric-tree/
 */
public class Solution {
    private boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        return left.val == right.val
                && isMirror(left.right, right.left)
                && isMirror(left.left, right.right);
    }

    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }
}
