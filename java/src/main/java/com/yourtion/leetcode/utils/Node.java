package com.yourtion.leetcode.utils;

import java.util.List;

/**
 * Definition for a Node.
 *
 * @author Yourtion
 */
public class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int v) {
        val = v;
    }

    public Node(int v, List<Node> c) {
        val = v;
        children = c;
    }
}
