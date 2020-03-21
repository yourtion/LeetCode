package com.yourtion.leetcode.easy.c0700;

import com.yourtion.leetcode.utils.TreeNode;

/**
 * 700. 二叉搜索树中的搜索
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/search-in-a-binary-search-tree/
 */
public class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val) {
            return root;
        }
        return root.val > val ? searchBST(root.left, val) : searchBST(root.right, val);
    }
}
