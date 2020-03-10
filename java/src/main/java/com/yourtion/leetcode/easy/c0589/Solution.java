package com.yourtion.leetcode.easy.c0589;

import com.yourtion.leetcode.utils.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * 589. N叉树的前序遍历
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/n-ary-tree-preorder-traversal/
 */
public class Solution {
    private List<Integer> ret = new ArrayList<>();

    void traverse(Node n) {
        if (n == null) {
            return;
        }
        ret.add(n.val);
        if (n.children == null) {
            return;
        }
        for (Node i : n.children) {
            traverse(i);
        }
    }

    public List<Integer> preorder(Node root) {
        traverse(root);
        return ret;
    }
}
