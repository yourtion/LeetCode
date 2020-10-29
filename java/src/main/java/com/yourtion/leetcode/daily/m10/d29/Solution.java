package com.yourtion.leetcode.daily.m10.d29;

import com.yourtion.leetcode.utils.TreeNode;

/**
 * 129. 求根到叶子节点数字之和
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/sum-root-to-leaf-numbers/
 */
public class Solution {
    public int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }

    private int dfs(TreeNode root, int prevSum) {
        if (root == null) {
            return 0;
        }
        int sum = prevSum * 10 + root.val;
        if (root.left == null && root.right == null) {
            return sum;
        } else {
            return dfs(root.left, sum) + dfs(root.right, sum);
        }
    }
}
