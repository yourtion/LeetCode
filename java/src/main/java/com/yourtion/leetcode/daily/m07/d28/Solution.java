package com.yourtion.leetcode.daily.m07.d28;

import com.yourtion.leetcode.utils.TreeNode;

public class Solution {
    private int depth(TreeNode node, int depth) {
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
