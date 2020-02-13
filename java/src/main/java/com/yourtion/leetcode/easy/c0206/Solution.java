package com.yourtion.leetcode.easy.c0206;

import com.yourtion.leetcode.utils.ListNode;

/**
 * 206. 反转链表
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/reverse-linked-list/
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode n = head;
        ListNode pre = null;
        while (n != null) {
            ListNode tmp = n.next;
            n.next = pre;
            pre = n;
            n = tmp;
        }
        return pre;
    }
}
