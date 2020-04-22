package com.yourtion.leetcode.daily.m04.d22;

import com.yourtion.leetcode.utils.TreeNode;

import java.util.*;

/**
 * 199. 二叉树的右视图
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/binary-tree-right-side-view/
 */
public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        Map<Integer, Integer> rightmostValueAtDepth = new HashMap<>();
        int max_depth = -1;

        Stack<TreeNode> nodeStack = new Stack<>();
        Stack<Integer> depthStack = new Stack<>();
        nodeStack.push(root);
        depthStack.push(0);

        while (!nodeStack.isEmpty()) {
            TreeNode node = nodeStack.pop();
            int depth = depthStack.pop();

            if (node != null) {
                // 维护二叉树的最大深度
                max_depth = Math.max(max_depth, depth);

                // 如果不存在对应深度的节点我们才插入
                if (!rightmostValueAtDepth.containsKey(depth)) {
                    rightmostValueAtDepth.put(depth, node.val);
                }

                nodeStack.push(node.left);
                nodeStack.push(node.right);
                depthStack.push(depth + 1);
                depthStack.push(depth + 1);
            }
        }

        for (int depth = 0; depth <= max_depth; depth++) {
            ret.add(rightmostValueAtDepth.get(depth));
        }
        return ret;
    }
}
