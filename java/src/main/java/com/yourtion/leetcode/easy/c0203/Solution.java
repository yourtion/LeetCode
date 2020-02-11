package com.yourtion.leetcode.easy.c0203;

import com.yourtion.leetcode.utils.ListNode;

/**
 * 203. 移除链表元素
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/remove-linked-list-elements/
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        if (head.val == val) {
            return removeElements(head.next, val);
        }
        ListNode n = head;
        while (n.next != null) {
            if (n.next.val == val) {
                n.next = n.next.next;
            } else {
                n = n.next;
            }
        }
        return head;
    }
}
