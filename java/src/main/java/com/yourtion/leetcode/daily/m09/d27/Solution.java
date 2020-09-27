package com.yourtion.leetcode.daily.m09.d27;

import com.yourtion.leetcode.utils.TreeNode;

/**
 * 235. 二叉搜索树的最近公共祖先
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
 */
public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p == null || q == null) {
            return null;
        }
        if (root.val >= p.val && root.val <= q.val) {
            return root;
        }
        if (root.val <= p.val && root.val >= q.val) {
            return root;
        }
        if (root.val > p.val) {
            return lowestCommonAncestor(root.left, p, q);
        }
        return lowestCommonAncestor(root.right, p, q);
    }
}
