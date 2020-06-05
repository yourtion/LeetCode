package com.yourtion.leetcode.easy.c9050;

import com.yourtion.leetcode.utils.ListNode;

/**
 * 9050. 面试题18. 删除链表的节点
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/shan-chu-lian-biao-de-jie-dian-lcof/
 */
public class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        if (head.val == val) {
            return head.next;
        }
        ListNode pre = head;
        ListNode n = pre.next;
        while (n != null) {
            if (n.val == val) {
                pre.next = n.next;
                break;
            }
            pre = pre.next;
            n = n.next;
        }
        return head;
    }
}
