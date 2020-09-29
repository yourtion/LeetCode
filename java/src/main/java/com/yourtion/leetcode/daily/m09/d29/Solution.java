package com.yourtion.leetcode.daily.m09.d29;

import com.yourtion.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 145. 二叉树的后序遍历
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/binary-tree-postorder-traversal/
 */
public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        postorder(root, res);
        return res;
    }

    private void postorder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        postorder(root.left, res);
        postorder(root.right, res);
        res.add(root.val);
    }
}
