package com.yourtion.leetcode.easy.c0237;

import com.yourtion.leetcode.utils.ListNode;

/**
 * 237. 删除链表中的节点
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/delete-node-in-a-linked-list/
 */
public class Solution {
    public void deleteNode(ListNode node) {
        if (node == null || node.next == null) {
            return;
        }
        ListNode n = node.next;
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
