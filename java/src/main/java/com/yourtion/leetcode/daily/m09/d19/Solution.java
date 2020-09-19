package com.yourtion.leetcode.daily.m09.d19;

import com.yourtion.leetcode.utils.TreeNode;

/**
 * 404. 左叶子之和
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/sum-of-left-leaves/
 */
public class Solution {
    private int sumOfLeftLeaves(TreeNode root, boolean isLeft) {
        if (root == null) {
            return 0;
        }
        if (isLeft && root.left == null && root.right == null) {
            return root.val;
        }
        return sumOfLeftLeaves(root.left, true) + sumOfLeftLeaves(root.right, false);
    }

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return sumOfLeftLeaves(root.left, true) + sumOfLeftLeaves(root.right, false);
    }
}
