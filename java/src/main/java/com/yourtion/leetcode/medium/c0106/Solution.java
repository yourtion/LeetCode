package com.yourtion.leetcode.medium.c0106;

import com.yourtion.leetcode.utils.TreeNode;

import java.util.HashMap;

/**
 * 106. 从中序与后序遍历序列构造二叉树
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/
 */
class Solution {
    private int postIdx;
    private int[] postOrder;
    private HashMap<Integer, Integer> idxMap = new HashMap<>();

    private TreeNode helper(int inLeft, int inRight) {
        if (inLeft > inRight) {
            return null;
        }
        int rootVal = postOrder[postIdx];
        TreeNode root = new TreeNode(rootVal);
        int index = idxMap.get(rootVal);

        postIdx -= 1;
        root.right = helper(index + 1, inRight);
        root.left = helper(inLeft, index - 1);
        return root;
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        this.postOrder = postorder;
        postIdx = postorder.length - 1;

        int idx = 0;
        for (Integer val : inorder) {
            idxMap.put(val, idx++);
        }
        return helper(0, inorder.length - 1);
    }
}
