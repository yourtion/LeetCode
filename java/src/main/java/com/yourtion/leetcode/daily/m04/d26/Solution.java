package com.yourtion.leetcode.daily.m04.d26;

import com.yourtion.leetcode.utils.ListNode;

/**
 * 23. 合并K个排序链表
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/merge-k-sorted-lists/
 */
public class Solution {
    private ListNode mergeTwoLists(ListNode a, ListNode b) {
        if (a == null || b == null) {
            return a != null ? a : b;
        }
        ListNode aPtr = a, bPtr = b;
        ListNode head = new ListNode(-1);
        ListNode tail = head;

        while (aPtr != null && bPtr != null) {
            if (aPtr.val < bPtr.val) {
                tail.next = aPtr;
                aPtr = aPtr.next;
            } else {
                tail.next = bPtr;
                bPtr = bPtr.next;
            }
            tail = tail.next;
        }
        tail.next = aPtr != null ? aPtr : bPtr;
        return head.next;
    }

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode ret = null;
        for (ListNode l : lists) {
            ret = mergeTwoLists(ret, l);
        }
        return ret;
    }
}
