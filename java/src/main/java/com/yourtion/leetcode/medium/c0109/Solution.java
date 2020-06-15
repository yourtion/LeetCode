package com.yourtion.leetcode.medium.c0109;

import com.yourtion.leetcode.utils.ListNode;
import com.yourtion.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 109. 有序链表转换二叉搜索树
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/convert-sorted-list-to-binary-search-tree/solution/you-xu-lian-biao-zhuan-huan-er-cha-sou-suo-shu-by-/
 */
public class Solution {
    private List<Integer> values = new ArrayList<>();

    private TreeNode convertListToBST(int left, int right) {
        if (left > right) {
            return null;
        }

        int mid = (left + right) / 2;
        TreeNode node = new TreeNode(this.values.get(mid));

        if (left == right) {
            return node;
        }

        node.left = convertListToBST(left, mid - 1);
        node.right = convertListToBST(mid + 1, right);
        return node;
    }

    public TreeNode sortedListToBST(ListNode head) {
        while (head != null) {
            this.values.add(head.val);
            head = head.next;
        }
        return convertListToBST(0, this.values.size() - 1);
    }
}
