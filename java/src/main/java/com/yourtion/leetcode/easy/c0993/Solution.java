package com.yourtion.leetcode.easy.c0993;

import com.yourtion.leetcode.utils.TreeNode;

/**
 * 993. 二叉树的堂兄弟节点
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/cousins-in-binary-tree/
 */
public class Solution {
    TreeNode nx = null;
    TreeNode ny = null;
    int lx = -1;
    int ly = -1;

    private void traverse(TreeNode node, TreeNode pre, int level, int x, int y) {
        if (node == null) {
            return;
        }
        if (node.val == x) {
            nx = pre;
            lx = level;
        }
        if (node.val == y) {
            ny = pre;
            ly = level;
        }
        traverse(node.left, node, level + 1, x, y);
        traverse(node.right, node, level + 1, x, y);
    }

    public boolean isCousins(TreeNode root, int x, int y) {
        traverse(root, null, 0, x, y);
        if (nx != null && ny != null) {
            return nx != ny && lx == ly;
        }
        return false;
    }
}
