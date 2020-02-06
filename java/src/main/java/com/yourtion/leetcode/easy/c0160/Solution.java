package com.yourtion.leetcode.easy.c0160;

import com.yourtion.leetcode.utils.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * 160. 相交链表
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/intersection-of-two-linked-lists/
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        Set<ListNode> set = new HashSet<>();
        while (a != null) {
            set.add(a);
            a = a.next;
        }
        while (b != null) {
            if (set.contains(b)) {
                return b;
            }
            b = b.next;
        }
        return null;
    }
}
