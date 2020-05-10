package com.yourtion.leetcode.daily.m05.d10;

import com.yourtion.leetcode.utils.TreeNode;

/**
 * 236. 二叉树的最近公共祖先
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree/
 */
public class Solution {
    private TreeNode ans;

    public Solution() {
        this.ans = null;
    }

    private boolean dfs(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return false;
        }
        boolean lSon = dfs(root.left, p, q);
        boolean rSon = dfs(root.right, p, q);
        if (root.val == p.val || root.val == q.val) {
            if (lSon || rSon) {
                ans = root;
            }
        } else if (lSon && rSon) {
            ans = root;
        }
        return lSon || rSon || (root.val == p.val || root.val == q.val);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        this.dfs(root, p, q);
        return this.ans;
    }
}
