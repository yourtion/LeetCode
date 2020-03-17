package com.yourtion.leetcode.easy.c0669;

import com.yourtion.leetcode.utils.TreeNode;

/**
 * 669. 修剪二叉搜索树
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/trim-a-binary-search-tree/
 */
public class Solution {
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if (root == null) {
            return null;
        }
        if (root.val >= L && root.val <= R) {
            root.left = trimBST(root.left, L, R);
            root.right = trimBST(root.right, L, R);
            return root;
        }
        return root.val < L ? trimBST(root.right, L, R) : trimBST(root.left, L, R);
    }
}
