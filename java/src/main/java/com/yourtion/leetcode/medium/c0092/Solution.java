package com.yourtion.leetcode.medium.c0092;

import com.yourtion.leetcode.utils.ListNode;

/**
 * 92. 反转链表 II
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/reverse-linked-list-ii/
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode cur = head, prev = null;
        while (m > 1) {
            prev = cur;
            cur = cur.next;
            m--;
            n--;
        }

        ListNode con = prev, tail = cur;
        ListNode third;
        while (n > 0) {
            third = cur.next;
            cur.next = prev;
            prev = cur;
            cur = third;
            n--;
        }

        if (con != null) {
            con.next = prev;
        } else {
            head = prev;
        }

        tail.next = cur;
        return head;
    }
}
