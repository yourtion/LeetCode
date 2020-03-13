package com.yourtion.leetcode.easy.c0617;

import com.yourtion.leetcode.utils.TreeNode;

/**
 * 617. 合并二叉树
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/merge-two-binary-trees/
 */
public class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return null;
        }
        if (t1 == null || t2 == null) {
            return t1 == null ? t2 : t1;
        }
        TreeNode root = new TreeNode(t1.val + t2.val);
        root.left = mergeTrees(t1.left, t2.left);
        root.right = mergeTrees(t2.right, t1.right);
        return root;
    }
}
