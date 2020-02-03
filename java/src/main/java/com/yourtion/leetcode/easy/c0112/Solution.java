package com.yourtion.leetcode.easy.c0112;

import com.yourtion.leetcode.utils.TreeNode;

/**
 * 112. 路径总和
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/path-sum/
 */
public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        if (sum == root.val && root.left == null && root.right == null) {
            return true;
        }
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}
