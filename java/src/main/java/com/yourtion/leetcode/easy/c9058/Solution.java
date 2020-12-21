package com.yourtion.leetcode.easy.c9058;

import com.yourtion.leetcode.utils.TreeNode;

import java.util.*;

/**
 * 9058. 面试题32 - II. 从上到下打印二叉树 II
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-ii-lcof/
 */
public class Solution {
    private final Map<Integer, List<Integer>> ret = new HashMap<>();

    private void traverse(TreeNode node, int level) {
        if (node == null) {
            return;
        }
        ret.putIfAbsent(level, new LinkedList<>());
        ret.get(level).add(node.val);
        traverse(node.left, level + 1);
        traverse(node.right, level + 1);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        traverse(root, 0);
        return new ArrayList<>(ret.values());
    }
}
