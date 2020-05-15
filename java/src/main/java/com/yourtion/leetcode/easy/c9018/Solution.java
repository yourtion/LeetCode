package com.yourtion.leetcode.easy.c9018;

import com.yourtion.leetcode.utils.TreeNode;

/**
 * 9018. 面试题 04.02. 最小高度树
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/minimum-height-tree-lcci/
 */
public class Solution {
    private TreeNode toTreeNode(int[] nums, int left, int right) {
        if (right < left) {
            return null;
        }
        if (left == right) {
            return new TreeNode(nums[left]);
        }
        int mid = left + (right - left) / 2;
        mid = (right - left) % 2 == 0 ? mid : mid + 1;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = toTreeNode(nums, left, mid - 1);
        node.right = toTreeNode(nums, mid + 1, right);
        return node;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return toTreeNode(nums, 0, nums.length - 1);
    }
}
