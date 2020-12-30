package com.yourtion.leetcode.easy.c9074;

import com.yourtion.leetcode.utils.TreeNode;

/**
 * 9074. 面试题 68 - I. 二叉搜索树的最近公共祖先
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-zui-jin-gong-gong-zu-xian-lcof/
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
