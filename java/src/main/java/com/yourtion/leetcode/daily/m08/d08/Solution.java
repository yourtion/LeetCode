package com.yourtion.leetcode.daily.m08.d08;

import com.yourtion.leetcode.utils.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 99. 恢复二叉搜索树
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/recover-binary-search-tree/
 */
public class Solution {
    public void recoverTree(TreeNode root) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode x = null, y = null, pred = null;

        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (pred != null && root.val < pred.val) {
                y = root;
                if (x == null) {
                    x = pred;
                } else {
                    break;
                }
            }
            pred = root;
            root = root.right;
        }

        swap(x, y);
    }

    private void swap(TreeNode x, TreeNode y) {
        if (x == null || y == null) {
            return;
        }
        int tmp = x.val;
        x.val = y.val;
        y.val = tmp;
    }
}
