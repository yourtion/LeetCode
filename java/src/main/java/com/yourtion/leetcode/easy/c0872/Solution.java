package com.yourtion.leetcode.easy.c0872;

import com.yourtion.leetcode.utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 872. 叶子相似的树
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/leaf-similar-trees/
 */
public class Solution {
    Queue<Integer> list = new LinkedList<>();

    private boolean dfs(TreeNode node, boolean compare) {
        if (node == null) {
            return true;
        }
        if (node.left == null && node.right == null) {
            if (compare) {
                return !list.isEmpty() && node.val == list.poll();
            } else {
                list.add(node.val);
            }
        }
        return dfs(node.left, compare) && dfs(node.right, compare);
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        dfs(root1, false);
        return dfs(root2, true) && list.isEmpty();
    }
}
