package com.yourtion.leetcode.daily.m06.d16;

import com.yourtion.leetcode.utils.TreeNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 297. 二叉树的序列化与反序列化
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/serialize-and-deserialize-binary-tree/
 */
public class Codec {
    private String reSerialize(TreeNode root, String str) {
        if (root == null) {
            str += "None,";
        } else {
            str += root.val + ",";
            str = reSerialize(root.left, str);
            str = reSerialize(root.right, str);
        }
        return str;
    }

    public String serialize(TreeNode root) {
        return reSerialize(root, "");
    }

    private TreeNode reDeserialize(List<String> l) {
        if ("None".equals(l.get(0))) {
            l.remove(0);
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(l.get(0)));
        l.remove(0);
        root.left = reDeserialize(l);
        root.right = reDeserialize(l);

        return root;
    }

    public TreeNode deserialize(String data) {
        String[] dataArray = data.split(",");
        List<String> dataList = new LinkedList<>(Arrays.asList(dataArray));
        return reDeserialize(dataList);
    }
}
