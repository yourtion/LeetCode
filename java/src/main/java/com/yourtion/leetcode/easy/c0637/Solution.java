package com.yourtion.leetcode.easy.c0637;

import com.yourtion.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 637. 二叉树的层平均值
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/average-of-levels-in-binary-tree/
 */
public class Solution {
    private Map<Object, double[]> map = new HashMap<>();

    void traverse(TreeNode n, int level) {
        if (n == null) {
            return;
        }
        double[] a = map.getOrDefault(level, new double[2]);
        a[0] += n.val;
        a[1] += 1;
        map.put(level, a);
        traverse(n.left, level + 1);
        traverse(n.right, level + 1);
    }

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        traverse(root, 0);
        for (double[] a : map.values()) {
            list.add(a[0] / a[1]);
        }
        return list;
    }
}
