package com.yourtion.leetcode.easy.c9054;

import com.yourtion.leetcode.utils.ListNode;

/**
 * 9054. 面试题25. 合并两个排序的链表
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/he-bing-liang-ge-pai-xu-de-lian-biao-lcof/
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode n = head;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                n.next = l2;
                l2 = l2.next;
            } else {
                n.next = l1;
                l1 = l1.next;
            }
            n = n.next;
        }
        n.next = l1 == null ? l2 : l1;
        return head.next;
    }
}
