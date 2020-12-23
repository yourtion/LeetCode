package com.yourtion.leetcode.easy.c9065;

import com.yourtion.leetcode.utils.TreeNode;

/**
 * 9065. 面试题54. 二叉搜索树的第k大节点
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-di-kda-jie-dian-lcof/
 */
public class Solution {
    int count;
    int ret = -1;

    private void traverse(TreeNode node) {
        if (node == null) {
            return;
        }
        traverse(node.right);
        count -= 1;
        if (count == 0) {
            ret = node.val;
            return;
        }
        traverse(node.left);
    }

    public int kthLargest(TreeNode root, int k) {
        count = k;
        traverse(root);
        return ret;
    }
}
