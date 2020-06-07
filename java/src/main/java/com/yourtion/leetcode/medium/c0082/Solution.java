package com.yourtion.leetcode.medium.c0082;

import com.yourtion.leetcode.utils.ListNode;

/**
 * 82. 删除排序链表中的重复元素 II
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list-ii/
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode dummy = new ListNode(-1);
        ListNode n = dummy;
        ListNode cur = head;
        ListNode pre = null;
        while (cur != null) {
            if (pre == null || cur.val != pre.val) {
                if (cur.next == null || cur.val != cur.next.val) {
                    n.next = new ListNode(cur.val);
                    n = n.next;
                }
            }
            pre = cur;
            cur = cur.next;
        }
        return dummy.next;
    }
}
