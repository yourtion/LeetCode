package com.yourtion.leetcode.daily.m10.d18;

import com.yourtion.leetcode.utils.ListNode;

/**
 * 19. 删除链表的倒数第N个节点
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;
        int len = 0;
        int k = n;
        while (fast != null) {
            fast = fast.next;
            if (k < 0) {
                slow = slow.next;
            }
            k -= 1;
            len += 1;
        }
        if (len == n) {
            return head.next;
        }
        slow.next = slow.next != null ? slow.next.next : null;
        return head;
    }
}
