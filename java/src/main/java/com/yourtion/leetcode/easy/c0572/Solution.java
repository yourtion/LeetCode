package com.yourtion.leetcode.easy.c0572;

import com.yourtion.leetcode.utils.TreeNode;

/**
 * 572. 另一个树的子树
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/subtree-of-another-tree/
 */
public class Solution {
    boolean isSameTree(TreeNode s, TreeNode t) {
        if (s == t) {
            return true;
        }
        if (s == null || t == null) {
            return false;
        }
        return s.val == t.val && isSameTree(s.left, t.left) && isSameTree(s.right, t.right);
    }

    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null) {
            return false;
        }
        return isSameTree(s, t) || isSubtree(s.left, t) || isSubtree(s.right, t);
    }
}
