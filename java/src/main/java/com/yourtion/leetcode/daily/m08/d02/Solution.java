package com.yourtion.leetcode.daily.m08.d02;

import com.yourtion.leetcode.utils.TreeNode;

/**
 * 114. 二叉树展开为链表
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/flatten-binary-tree-to-linked-list/
 */
public class Solution {
    public void flatten(TreeNode root) {
        TreeNode curr = root;
        while (curr != null) {
            if (curr.left != null) {
                TreeNode next = curr.left;
                TreeNode predecessor = next;
                while (predecessor.right != null) {
                    predecessor = predecessor.right;
                }
                predecessor.right = curr.right;
                curr.left = null;
                curr.right = next;
            }
            curr = curr.right;
        }
    }
}
