package com.yourtion.leetcode.easy.c9075;

import com.yourtion.leetcode.utils.TreeNode;

/**
 * 9075. 面试题 68 - II. 二叉树的最近公共祖先
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/er-cha-shu-de-zui-jin-gong-gong-zu-xian-lcof/
 */
public class Solution {
    private TreeNode ans = null;

    private boolean dfs(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return false;
        }
        boolean leftSon = dfs(root.left, p, q);
        boolean rightSon = dfs(root.right, p, q);
        if (leftSon && rightSon) {
            ans = root;
        }
        if (root.val == p.val || root.val == q.val) {
            if (leftSon || rightSon) {
                ans = root;
            }
        }
        return leftSon || rightSon || (root.val == p.val || root.val == q.val);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        this.dfs(root, p, q);
        return this.ans;
    }
}
