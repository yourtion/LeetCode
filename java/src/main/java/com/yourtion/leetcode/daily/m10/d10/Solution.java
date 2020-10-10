package com.yourtion.leetcode.daily.m10.d10;

import com.yourtion.leetcode.utils.ListNode;

/**
 * 142. 环形链表 II
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/linked-list-cycle-ii/
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode slow = head, fast = head;
        while (fast != null) {
            slow = slow.next;
            if (fast.next != null) {
                fast = fast.next.next;
            } else {
                return null;
            }
            if (fast == slow) {
                ListNode ptr = head;
                while (ptr != slow) {
                    ptr = ptr.next;
                    slow = slow.next;
                }
                return ptr;
            }
        }
        return null;
    }
}
