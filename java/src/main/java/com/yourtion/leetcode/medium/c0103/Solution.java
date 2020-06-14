package com.yourtion.leetcode.medium.c0103;

import com.yourtion.leetcode.utils.TreeNode;

import java.util.*;

/**
 * 103. 二叉树的锯齿形层次遍历
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/binary-tree-zigzag-level-order-traversal/
 */
public class Solution {
    private Map<Integer, LinkedList<Integer>> ret;

    private void traverse(TreeNode node, int n) {
        if (node == null) {
            return;
        }
        ret.putIfAbsent(n, new LinkedList<>());
        traverse(node.left, n + 1);
        if (n % 2 == 0) {
            ret.get(n).addLast(node.val);
        } else {
            ret.get(n).addFirst(node.val);
        }
        traverse(node.right, n + 1);
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        ret = new HashMap<>(16);
        traverse(root, 0);
        return new ArrayList<>(ret.values());
    }
}
