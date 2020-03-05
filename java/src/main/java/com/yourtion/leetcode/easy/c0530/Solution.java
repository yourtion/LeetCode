package com.yourtion.leetcode.easy.c0530;

import com.yourtion.leetcode.utils.TreeNode;

import java.util.HashSet;
import java.util.Set;

/**
 * 530. 二叉搜索树的最小绝对差
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/minimum-absolute-difference-in-bst/
 */
public class Solution {

    int getMinimumDifference(TreeNode root, Set<Integer> set) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        int ret = Integer.MAX_VALUE;
        for (int n : set) {
            ret = Math.min(ret, Math.abs(root.val - n));
        }
        if (root.left == null && root.right == null) {
            return ret;
        }
        set.add(root.val);
        int sub = Math.min(getMinimumDifference(root.left, set), getMinimumDifference(root.right, set));
        return Math.min(sub, ret);
    }

    public int getMinimumDifference(TreeNode root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        Set<Integer> set = new HashSet<>();
        set.add(root.val);
        return Math.min(getMinimumDifference(root.left, set), getMinimumDifference(root.right, set));
    }
}
