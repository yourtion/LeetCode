package com.yourtion.leetcode.daily.m08.d05;

import com.yourtion.leetcode.utils.TreeNode;

/**
 * 337. 打家劫舍 III
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/house-robber-iii/
 */
public class Solution {
    public int rob(TreeNode root) {
        int[] rootStatus = dfs(root);
        return Math.max(rootStatus[0], rootStatus[1]);
    }

    private int[] dfs(TreeNode node) {
        if (node == null) {
            return new int[]{0, 0};
        }
        int[] l = dfs(node.left);
        int[] r = dfs(node.right);
        int selected = node.val + l[1] + r[1];
        int notSelected = Math.max(l[0], l[1]) + Math.max(r[0], r[1]);
        return new int[]{selected, notSelected};
    }
}
