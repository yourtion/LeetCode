package com.yourtion.leetcode.easy.c0687;

import com.yourtion.leetcode.utils.TreeNode;

/**
 * 687. 最长同值路径
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/longest-univalue-path/
 */
public class Solution {
    int ret = 0;

    int traverse(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int l = traverse(node.left);
        int r = traverse(node.right);
        int arrowLeft = 0, arrowRight = 0;
        if (node.left != null && node.left.val == node.val) {
            arrowLeft += l + 1;
        }
        if (node.right != null && node.right.val == node.val) {
            arrowRight += r + 1;
        }
        ret = Math.max(ret, arrowLeft + arrowRight);
        return Math.max(arrowLeft, arrowRight);
    }

    public int longestUnivaluePath(TreeNode root) {
        traverse(root);
        return ret;
    }
}
