package com.yourtion.leetcode.daily.m08.d07;

import com.yourtion.leetcode.utils.TreeNode;

/**
 * @author Yourtion
 */
public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p != null && q != null && p.val == q.val) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        } else {
            return p == null && q == null;
        }
    }
}
