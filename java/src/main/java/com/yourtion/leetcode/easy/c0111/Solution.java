package com.yourtion.leetcode.easy.c0111;

import com.yourtion.leetcode.utils.TreeNode;

/**
 * 111. 二叉树的最小深度
 *
 * @author yourtion
 * @link https://leetcode-cn.com/problems/minimum-depth-of-binary-tree/
 */
public class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        int res = Integer.MAX_VALUE;
        if (root.left != null) {
            res = Math.min(res, minDepth(root.left));
        }
        if (root.right != null) {
            res = Math.min(res, minDepth(root.right));
        }
        return res + 1;
    }
}
