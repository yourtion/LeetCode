package com.yourtion.leetcode.easy.c9062;

import com.yourtion.leetcode.utils.ListNode;

/**
 * 9062. 面试题52. 两个链表的第一个公共节点
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/liang-ge-lian-biao-de-di-yi-ge-gong-gong-jie-dian-lcof/
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        while (a != null && b != null) {
            if (a == b) {
                return a;
            }
            if (a.next != null && b.next != null) {
                a = a.next;
                b = b.next;
            } else if (a.next == null) {
                a = headB;
                b = b.next;
            } else if (b.next == null) {
                b = headA;
                a = a.next;
            }
        }
        return null;
    }
}

