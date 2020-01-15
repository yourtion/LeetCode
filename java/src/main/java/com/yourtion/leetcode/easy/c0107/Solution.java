package com.yourtion.leetcode.easy.c0107;

import com.yourtion.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 107. 二叉树的层次遍历 II
 *
 * @author yourtion
 * @link https://leetcode-cn.com/problems/binary-tree-level-order-traversal-ii/
 */
public class Solution {
    void nodeToList(TreeNode node, Integer depth, Map<Integer, List<Integer>> ret) {
        List<Integer> res = ret.computeIfAbsent(depth, k -> new ArrayList<>());
        if (node == null) {
            return;
        }
        if (node.left != null) {
            res.add(node.left.val);
            nodeToList(node.left, depth + 1, ret);
        }
        if (node.right != null) {
            res.add(node.right.val);
            nodeToList(node.right, depth + 1, ret);
        }
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Map<Integer, List<Integer>> map = new HashMap<>(32);
        if (root != null) {
            List<Integer> r = new ArrayList<>();
            r.add(root.val);
            map.put(0, r);
            nodeToList(root, 1, map);
        }
        List<List<Integer>> ret = new ArrayList<>();
        map.forEach((k, v) -> {
            if (!v.isEmpty()) {
                ret.add(0, v);
            }
        });
        return ret;
    }
}
