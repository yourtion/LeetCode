package com.yourtion.leetcode.easy.c9039;

import com.yourtion.leetcode.utils.TreeNode;

/**
 * 9039. 面试题 17.12. BiNode
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/binode-lcci/
 */
public class Solution {
    public TreeNode convertBiNode(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode subRoot = convertBiNode(root.left);
        if (subRoot == null) {
            subRoot = root;
        } else {
            TreeNode subRootTmp = subRoot;
            while (subRoot.right != null) {
                subRoot = subRoot.right;
            }
            subRoot.right = root;
            subRoot = subRootTmp;
        }
        root.left = null;
        root.right = convertBiNode(root.right);
        return subRoot;
    }
}
