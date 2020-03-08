package com.yourtion.leetcode.easy.c0563;

import com.yourtion.leetcode.utils.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * 563. 二叉树的坡度
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/binary-tree-tilt/
 */
public class Solution {
    Map<TreeNode, Integer> cache = new HashMap<>(32);

    int sum(TreeNode node) {
        if (node == null) {
            return 0;
        }
        if (cache.get(node) != null) {
            return cache.get(node);
        }
        int sum = node.val + sum(node.left) + sum(node.right);
        cache.put(node, sum);
        return sum;
    }

    public int findTilt(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 0;
        }
        int sumLeft = sum(root.left);
        int sumRight = sum(root.right);
        int p = Math.abs(sumLeft - sumRight);
        return findTilt(root.left) + findTilt(root.right) + p;
    }
}
