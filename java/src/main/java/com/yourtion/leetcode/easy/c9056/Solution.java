package com.yourtion.leetcode.easy.c9056;

import com.yourtion.leetcode.utils.TreeNode;

/**
 * 9056. 面试题28. 对称的二叉树
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/dui-cheng-de-er-cha-shu-lcof/
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
