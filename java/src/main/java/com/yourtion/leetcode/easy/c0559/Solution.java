package com.yourtion.leetcode.easy.c0559;

import com.yourtion.leetcode.utils.Node;

/**
 * 559. N叉树的最大深度
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/maximum-depth-of-n-ary-tree/
 */
public class Solution {

    int traverse(Node node, int c) {
        if (node == null) {
            return c;
        }
        c += 1;
        if (node.children == null) {
            return c;
        }
        int ret = c;
        for (Node n : node.children) {
            ret = Math.max(ret, traverse(n, c));
        }
        return ret;
    }

    public int maxDepth(Node root) {
        return traverse(root, 0);
    }
}
