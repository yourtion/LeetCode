package com.yourtion.leetcode.medium.c0095;

import com.yourtion.leetcode.utils.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * 95. 不同的二叉搜索树 II
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/unique-binary-search-trees-ii/
 */
public class Solution {
    private LinkedList<TreeNode> generateTrees(int start, int end) {
        LinkedList<TreeNode> allTrees = new LinkedList<>();
        if (start > end) {
            allTrees.add(null);
            return allTrees;
        }
        for (int i = start; i <= end; i++) {
            LinkedList<TreeNode> leftTrees = generateTrees(start, i - 1);
            LinkedList<TreeNode> rightTrees = generateTrees(i + 1, end);
            for (TreeNode l : leftTrees) {
                for (TreeNode r : rightTrees) {
                    TreeNode currentTree = new TreeNode(i);
                    currentTree.left = l;
                    currentTree.right = r;
                    allTrees.add(currentTree);
                }
            }
        }
        return allTrees;
    }

    public List<TreeNode> generateTrees(int n) {
        if (n == 0) {
            return new LinkedList<>();
        }
        return generateTrees(1, n);
    }
}
