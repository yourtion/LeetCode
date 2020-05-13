package com.yourtion.leetcode.daily.m05.d13;

import com.yourtion.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 102. 二叉树的层序遍历
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/binary-tree-level-order-traversal/
 */
public class Solution {
    private void traverse(List<List<Integer>> list, TreeNode node, int level) {
        if (node == null) {
            return;
        }
        if (list.size() < level + 1 || list.get(level) == null) {
            list.add(level, new ArrayList<>());
        }
        traverse(list, node.left, level + 1);
        list.get(level).add(node.val);
        traverse(list, node.right, level + 1);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<>();
        traverse(ret, root, 0);
        return ret;
    }
}
