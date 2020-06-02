package com.yourtion.leetcode.medium.c0061;

import com.yourtion.leetcode.utils.ListNode;

/**
 * 61. 旋转链表
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/rotate-list/
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        int c = 0;
        ListNode n = head;
        ListNode pre = n;
        while (n != null) {
            c += 1;
            pre = n;
            n = n.next;
        }
        if (c == 0) {
            return head;
        }
        k = c - k % c;
        if (k == 0) {
            return head;
        }
        pre.next = head;
        n = head;
        while (k > 0) {
            k -= 1;
            pre = pre.next;
            n = pre.next;
        }
        pre.next = null;
        return n;
    }
}
