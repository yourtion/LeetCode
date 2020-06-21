package com.yourtion.leetcode.daily.m06.d21;

import com.yourtion.leetcode.utils.TreeNode;

/**
 * 124. 二叉树中的最大路径和
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/binary-tree-maximum-path-sum/
 */
public class Solution {
    private int ret = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        traverse(root);
        return ret;
    }

    private int traverse(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = Math.max(traverse(node.left), 0);
        int right = Math.max(traverse(node.right), 0);
        int price = node.val + left + right;
        ret = Math.max(ret, price);
        return node.val + Math.max(left, right);
    }
}
