package com.yourtion.leetcode.medium.c0086;

import com.yourtion.leetcode.utils.ListNode;

/**
 * 86. 分隔链表
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/partition-list/
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(-1);
        ListNode ret = dummy;
        ListNode tail = new ListNode(-1);
        ListNode t = tail;
        ListNode n = head;
        while (n != null) {
            if (n.val >= x) {
                tail.next = n;
                tail = tail.next;
            } else {
                dummy.next = n;
                dummy = dummy.next;
            }
            n = n.next;
        }
        tail.next = null;
        dummy.next = t.next;
        return ret.next;
    }
}
