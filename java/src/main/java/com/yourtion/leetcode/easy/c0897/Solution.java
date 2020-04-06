package com.yourtion.leetcode.easy.c0897;

import com.yourtion.leetcode.utils.TreeNode;

/**
 * 897. 递增顺序查找树
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/increasing-order-search-tree/
 */
public class Solution {
    TreeNode ret = new TreeNode(0);

    private void traverse(TreeNode node) {
        if (node == null) {
            return;
        }
        traverse(node.left);
        ret.right = new TreeNode(node.val);
        ret = ret.right;
        traverse(node.right);
    }

    public TreeNode increasingBST(TreeNode root) {
        TreeNode r = ret;
        traverse(root);
        return r.right;
    }
}
