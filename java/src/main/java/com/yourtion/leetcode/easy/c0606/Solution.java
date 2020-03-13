package com.yourtion.leetcode.easy.c0606;

import com.yourtion.leetcode.utils.TreeNode;

/**
 * 606. 根据二叉树创建字符串
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/construct-string-from-binary-tree/
 */
public class Solution {
    private StringBuilder sb = new StringBuilder();

    void traverse(TreeNode n) {
        if (n == null) {
            return;
        }
        sb.append("(").append(n.val);
        if (n.left == null && n.right == null) {
            sb.append(")");
            return;
        }
        if (n.left == null) {
            sb.append("()");
        } else {
            traverse(n.left);
        }
        traverse(n.right);
        sb.append(")");
    }

    public String tree2str(TreeNode t) {
        if (t == null) {
            return "";
        }
        traverse(t);
        return sb.substring(1, sb.length() - 1);
    }
}
