package com.yourtion.leetcode.easy.c0965;

import com.yourtion.leetcode.utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 965. 单值二叉树
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/univalued-binary-tree/
 */
public class Solution {
    public boolean isUnivalTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        int val = root.val;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode n = q.poll();
            if (n.val != val) {
                return false;
            }
            if (n.left != null) {
                q.add(n.left);
            }
            if (n.right != null) {
                q.add(n.right);
            }
        }
        return true;
    }
}
