package com.yourtion.leetcode.utils;

/**
 * Definition for a binary tree node.
 *
 * @author yourtion
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        return print("", this, false);
    }

    private String print(String prefix, TreeNode n, boolean isLeft) {
        StringBuilder sb = new StringBuilder();
        if (n != null) {
            sb.append(prefix).append(isLeft ? "|-- " : "\\-- ").append(n.val).append("\n");
            sb.append(print(prefix + (isLeft ? "|   " : "    "), n.left, true));
            sb.append(print(prefix + (isLeft ? "|   " : "    "), n.right, false));
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        return this == o;
    }

    @Override
    public int hashCode() {
        int result = val;
        result = 31 * result + (left != null ? left.hashCode() : 0) + (right != null ? right.hashCode() : 0);
        return result;
    }
}
