package com.yourtion.leetcode.easy.c0938;

import com.yourtion.leetcode.utils.TreeNode;

/**
 * 938. 二叉搜索树的范围和
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/range-sum-of-bst/
 */
public class Solution {
    int sum = 0;

    private void traverse(TreeNode node, int l, int r) {
        if (node == null) {
            return;
        }
        if (node.val >= l && node.val <= r) {
            sum += node.val;
        }
        traverse(node.left, l, r);
        traverse(node.right, l, r);
    }

    public int rangeSumBST(TreeNode root, int L, int R) {
        traverse(root, L, R);
        return sum;
    }
}
