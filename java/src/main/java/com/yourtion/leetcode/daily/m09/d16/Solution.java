package com.yourtion.leetcode.daily.m09.d16;

import com.yourtion.leetcode.utils.TreeNode;

/**
 * 226. 翻转二叉树
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/invert-binary-tree/
 */
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        if (root.left == null && root.right == null) {
            return root;
        }
        TreeNode tmp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(tmp);
        return root;
    }
}
