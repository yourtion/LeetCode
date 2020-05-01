package com.yourtion.leetcode.daily.m05.d01;

import com.yourtion.leetcode.utils.ListNode;

/**
 * 21. 合并两个有序链表
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/merge-two-sorted-lists/
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return l1 == null ? l2 : l1;
        }
        ListNode root = new ListNode(-1);
        ListNode ret = root;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                ret.next = l2;
                l2 = l2.next;
            } else {
                ret.next = l1;
                l1 = l1.next;
            }
            ret = ret.next;
        }
        ret.next = l1 == null ? l2 : l1;
        return root.next;
    }
}
