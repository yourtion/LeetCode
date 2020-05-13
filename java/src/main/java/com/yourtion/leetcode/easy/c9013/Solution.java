package com.yourtion.leetcode.easy.c9013;

import com.yourtion.leetcode.utils.ListNode;

/**
 * 9013. 面试题 02.07. 链表相交
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/intersection-of-two-linked-lists-lcci/
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pa = headA;
        ListNode pb = headB;
        while (pa != null && pb != null) {
            if (pa == pb) {
                return pa;
            }
            if (pa.next != null && pb.next != null) {
                pa = pa.next;
                pb = pb.next;
            } else if (pa.next == null) {
                pa = headB;
                pb = pb.next;
            } else if (pb.next == null) {
                pb = headA;
                pa = pa.next;
            }
        }
        return null;
    }
}
