package com.yourtion.leetcode.easy.c0108;

import com.yourtion.leetcode.utils.TreeNode;

/**
 * 108. 将有序数组转换为二叉搜索树
 *
 * @author yourtion
 * @link https://leetcode-cn.com/problems/convert-sorted-array-to-binary-search-tree/
 */
public class Solution {

    TreeNode buildTree(int[] nums, int start, int end) {
        if (end == start) {
            return new TreeNode(nums[start]);
        }
        if (start > end) {
            return null;
        }
        int mid = start + (end - start) / 2;
        TreeNode tn = new TreeNode(nums[mid]);
        tn.left = buildTree(nums, start, mid - 1);
        tn.right = buildTree(nums, mid + 1, end);
        return tn;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length < 1) {
            return null;
        }
        return buildTree(nums, 0, nums.length - 1);
    }
}
