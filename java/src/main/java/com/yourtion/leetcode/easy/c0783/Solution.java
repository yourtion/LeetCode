package com.yourtion.leetcode.easy.c0783;

import com.yourtion.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 783. 二叉搜索树结点最小距离
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/minimum-distance-between-bst-nodes/
 */
public class Solution {
    List<Integer> list = new ArrayList<>();

    void traverse(TreeNode node) {
        if (node == null) {
            return;
        }
        list.add(node.val);
        traverse(node.left);
        traverse(node.right);
    }

    public int minDiffInBST(TreeNode root) {
        traverse(root);
        list.sort(Comparator.comparingInt(a -> a));
        int ret = Integer.MAX_VALUE;
        int past = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            ret = Math.min(ret, list.get(i) - past);
            past = list.get(i);
        }
        return ret;
    }
}
