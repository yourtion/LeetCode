package com.yourtion.leetcode.daily.m07.d03;

import com.yourtion.leetcode.utils.TreeNode;

/**
 * 108. 将有序数组转换为二叉搜索树
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/convert-sorted-array-to-binary-search-tree/
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
