package com.yourtion.leetcode.medium.c0094;

import com.yourtion.leetcode.utils.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * 94. 二叉树的中序遍历
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/binary-tree-inorder-traversal/
 */
public class Solution {
    private List<Integer> ret = new LinkedList<>();

    private void traverse(TreeNode node) {
        if (node == null) {
            return;
        }
        traverse(node.left);
        ret.add(node.val);
        traverse(node.right);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        traverse(root);
        return ret;
    }
}
