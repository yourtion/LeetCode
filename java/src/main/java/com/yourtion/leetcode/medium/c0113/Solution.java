package com.yourtion.leetcode.medium.c0113;

import com.yourtion.leetcode.utils.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 113. 路径总和 II
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/path-sum-ii/
 */
public class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }

        // Java 文档中 Stack 类建议使用 Deque 代替 Stack，注意：只使用栈的相关接口
        Deque<Integer> path = new ArrayDeque<>();
        backtrack(root, sum, path, res);
        return res;
    }

    private void backtrack(TreeNode node, int sum, Deque<Integer> path, List<List<Integer>> res) {

        // 递归终止条件
        if (node == null) {
            return;
        }

        // 沿途结点必须选择，这个时候要做两件事：1、sum 减去这个结点的值；2、添加到 path 里
        sum -= node.val;
        path.addLast(node.val);

        if (sum == 0 && node.left == null && node.right == null) {
            res.add(new ArrayList<>(path));
            path.removeLast();
            return;
        }

        backtrack(node.left, sum, path, res);
        backtrack(node.right, sum, path, res);
        // 递归完成以后，必须重置变量
        path.removeLast();
    }
}
