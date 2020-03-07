package com.yourtion.leetcode.easy.c0543;

import com.yourtion.leetcode.utils.TreeNode;

/**
 * 543. 二叉树的直径
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/diameter-of-binary-tree/
 */
public class Solution {
    int ans = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        ans = 1;
        depth(root);
        return ans - 1;
    }

    public int depth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int l = depth(node.left);
        int r = depth(node.right);
        ans = Math.max(ans, l + r + 1);
        return Math.max(l, r) + 1;
    }
}
