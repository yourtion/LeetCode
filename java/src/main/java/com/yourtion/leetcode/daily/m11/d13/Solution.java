package com.yourtion.leetcode.daily.m11.d13;

import com.yourtion.leetcode.utils.ListNode;

/**
 * 328. 奇偶链表
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/odd-even-linked-list/
 */
public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode evenHead = head.next;
        ListNode odd = head, even = evenHead;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}
