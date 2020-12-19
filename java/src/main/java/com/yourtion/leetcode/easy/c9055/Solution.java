package com.yourtion.leetcode.easy.c9055;

import com.yourtion.leetcode.utils.TreeNode;

/**
 * 9055. 面试题27. 二叉树的镜像
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/er-cha-shu-de-jing-xiang-lcof/
 */
public class Solution {
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        mirrorTree(root.left);
        mirrorTree(root.right);
        return root;
    }
}
