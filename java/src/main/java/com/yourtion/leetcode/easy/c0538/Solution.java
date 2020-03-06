package com.yourtion.leetcode.easy.c0538;

import com.yourtion.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 538. 把二叉搜索树转换为累加树
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/convert-bst-to-greater-tree/
 */
public class Solution {
    void traverse(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        list.add(node.val);
        traverse(node.right, list);
        traverse(node.left, list);
        int sum = node.val;
        for (int n : list) {
            if (n > node.val) {
                sum += n;
            }
        }
        node.val = sum;
    }

    public TreeNode convertBST(TreeNode root) {
        traverse(root, new ArrayList<>());
        return root;
    }
}
