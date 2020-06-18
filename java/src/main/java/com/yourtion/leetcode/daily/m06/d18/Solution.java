package com.yourtion.leetcode.daily.m06.d18;

import com.yourtion.leetcode.utils.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 1028. 从先序遍历还原二叉树
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/recover-a-tree-from-preorder-traversal/
 */
public class Solution {
    public TreeNode recoverFromPreorder(String S) {
        Deque<TreeNode> path = new LinkedList<>();
        int pos = 0;
        while (pos < S.length()) {
            int level = 0;
            while (S.charAt(pos) == '-') {
                ++level;
                ++pos;
            }
            int value = 0;
            while (pos < S.length() && Character.isDigit(S.charAt(pos))) {
                value = value * 10 + (S.charAt(pos) - '0');
                ++pos;
            }
            TreeNode node = new TreeNode(value);
            if (level == path.size()) {
                if (!path.isEmpty()) {
                    path.peek().left = node;
                }
            } else {
                while (level != path.size()) {
                    path.pop();
                }
                if (path.peek() != null) {
                    path.peek().right = node;
                }
            }
            path.push(node);
        }
        while (path.size() > 1) {
            path.pop();
        }
        return path.peek();
    }
}
