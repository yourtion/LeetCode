package com.yourtion.leetcode.easy.c0104;

import com.yourtion.leetcode.utils.TreeNode;

/**
 * 104. 二叉树的最大深度
 *
 * @author yourtion
 * @link https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/
 */
public class Solution {
    int depth(TreeNode node, int depth) {
        if (node == null) {
            return depth;
        }
        depth += 1;
        if (node.left == null && node.right == null) {
            return depth;
        }
        return Math.max(depth(node.left, depth), depth(node.right, depth));
    }

    public int maxDepth(TreeNode root) {
        return depth(root, 0);
    }
}
