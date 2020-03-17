package com.yourtion.leetcode.easy.c0671;

import com.yourtion.leetcode.utils.TreeNode;

import java.util.HashSet;
import java.util.Set;

/**
 * 671. 二叉树中第二小的节点
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/second-minimum-node-in-a-binary-tree/
 */
public class Solution {
    Set<Integer> set = new HashSet<>();

    void traverse(TreeNode node) {
        if (node == null) {
            return;
        }
        set.add(node.val);
        traverse(node.left);
        traverse(node.right);
    }

    public int findSecondMinimumValue(TreeNode root) {
        traverse(root);
        if (set.size() == 1) {
            return -1;
        }
        int min = Integer.MAX_VALUE;
        int ret = Integer.MAX_VALUE;
        for (int a : set) {
            min = Math.min(a, min);
        }
        for (int a : set) {
            if (a == min) {
                continue;
            }
            ret = Math.min(a, ret);
        }
        return ret;
    }
}
