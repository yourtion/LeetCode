package com.yourtion.leetcode.daily.m09.d24;

import com.yourtion.leetcode.utils.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Yourtion
 */
public class Solution {
    private int traverse(TreeNode node, Map<Integer, Integer> map, int count) {
        if (node == null) {
            return count;
        }
        int c = map.getOrDefault(node.val, 0) + 1;
        map.put(node.val, c);
        return Math.max(traverse(node.left, map, c), traverse(node.right, map, c));
    }

    public int[] findMode(TreeNode root) {
        Map<Integer, Integer> map = new HashMap<>(16);
        int c = traverse(root, map, 0);
        int len = 0;
        for (int cc : map.values()) {
            if (cc == c) {
                len++;
            }
        }
        int[] ret = new int[len];
        len = 0;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() == c) {
                ret[len++] = e.getKey();
            }
        }
        return ret;
    }
}
