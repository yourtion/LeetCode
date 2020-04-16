package com.yourtion.leetcode.easy.c1022;

import com.yourtion.leetcode.utils.TreeNode;

/**
 * 1022. 从根到叶的二进制数之和
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/sum-of-root-to-leaf-binary-numbers/
 */
public class Solution {
    int ret = 0;

    private void traverse(TreeNode node, int sum) {
        if (node == null) {
            return;
        }
        sum = sum * 2 + node.val;
        if (node.left == null && node.right == null) {
            ret += sum;
            return;
        }
        traverse(node.left, sum);
        traverse(node.right, sum);
    }

    public int sumRootToLeaf(TreeNode root) {
        traverse(root, 0);
        return ret;
    }
}
