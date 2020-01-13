package com.yourtion.leetcode.easy.c0100;

import com.yourtion.leetcode.utils.TreeNode;

/**
 * 100. 相同的树
 *
 * @author yourtion
 * @link https://leetcode-cn.com/problems/same-tree/
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
