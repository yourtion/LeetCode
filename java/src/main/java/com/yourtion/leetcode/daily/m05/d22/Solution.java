package com.yourtion.leetcode.daily.m05.d22;

import com.yourtion.leetcode.utils.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * 105. 从前序与中序遍历序列构造二叉树
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
 */
public class Solution {
    private Map<Integer, Integer> indexMap;

    private TreeNode myBuildTree(int[] preOrder, int pLeft, int pRight, int iLeft) {
        if (pLeft > pRight) {
            return null;
        }

        // 前序遍历中的第一个节点就是根节点
        int pRoot = pLeft;
        // 在中序遍历中定位根节点
        int iRoot = indexMap.get(preOrder[pRoot]);

        // 先把根节点建立出来
        TreeNode root = new TreeNode(preOrder[pRoot]);
        // 得到左子树中的节点数目
        int sizeLeftSubtree = iRoot - iLeft;
        // 递归地构造左子树，并连接到根节点
        // 先序遍历中「从 左边界+1 开始的 size_left_subtree」个元素就对应了中序遍历中「从 左边界 开始到 根节点定位-1」的元素
        root.left = myBuildTree(preOrder, pLeft + 1, pLeft + sizeLeftSubtree, iLeft);
        // 递归地构造右子树，并连接到根节点
        // 先序遍历中「从 左边界+1+左子树节点数目 开始到 右边界」的元素就对应了中序遍历中「从 根节点定位+1 到 右边界」的元素
        root.right = myBuildTree(preOrder, pLeft + sizeLeftSubtree + 1, pRight, iRoot + 1);
        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        // 构造哈希映射，帮助我们快速定位根节点
        indexMap = new HashMap<>(n);
        for (int i = 0; i < n; i++) {
            indexMap.put(inorder[i], i);
        }
        return myBuildTree(preorder, 0, n - 1, 0);
    }
}
