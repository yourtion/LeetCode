package com.yourtion.leetcode.easy.c0590;

import com.yourtion.leetcode.utils.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * 590. N叉树的后序遍历
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/n-ary-tree-postorder-traversal/
 */
public class Solution {
    private List<Integer> ret = new ArrayList<>();

    void traverse(Node n) {
        if (n == null) {
            return;
        }
        if (n.children == null) {
            ret.add(n.val);
            return;
        }
        for (Node i : n.children) {
            traverse(i);
        }
        ret.add(n.val);
    }

    public List<Integer> postorder(Node root) {
        traverse(root);
        return ret;
    }
}
