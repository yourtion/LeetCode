package com.yourtion.leetcode.easy.c0437;

import com.yourtion.leetcode.utils.TreeNode;

/**
 * 437. 路径总和 III
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/path-sum-iii/
 */
public class Solution {
    int pathSum(TreeNode tn, int sum, int[] list, int p) {
        if (tn == null) {
            return 0;
        }
        int c = 0;
        list[p] = tn.val;
        int add = 0;
        for (int i = p; i >= 0; i--) {
            add += list[i];
            if (add == sum) {
                c += 1;
            }
        }
        return c + pathSum(tn.left, sum, list, p + 1) + pathSum(tn.right, sum, list, p + 1);
    }

    public int pathSum(TreeNode root, int sum) {
        return pathSum(root, sum, new int[1000], 0);
    }
}
