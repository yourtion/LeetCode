package com.yourtion.leetcode.daily.m09.d04;

import com.yourtion.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 257. 二叉树的所有路径
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/binary-tree-paths/
 */
public class Solution {
    private void buildPath(List<String> list, StringBuilder sb, TreeNode tn) {
        if (tn == null) {
            return;
        }
        sb.append(tn.val);
        if (tn.left == null && tn.right == null) {
            list.add(sb.toString());
        }
        sb.append("->");
        if (tn.left != null && tn.right != null) {
            buildPath(list, new StringBuilder(sb), tn.left);
            buildPath(list, new StringBuilder(sb), tn.right);
        } else {
            buildPath(list, sb, tn.left != null ? tn.left : tn.right);
        }
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ret = new ArrayList<>();
        buildPath(ret, new StringBuilder(), root);
        return ret;
    }
}
