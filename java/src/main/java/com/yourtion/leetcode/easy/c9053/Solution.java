package com.yourtion.leetcode.easy.c9053;

import com.yourtion.leetcode.utils.ListNode;

/**
 * 9053. 面试题24. 反转链表
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/fan-zhuan-lian-biao-lcof/
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = head;
        ListNode cur = head.next;
        head.next = null;
        while (cur != null) {
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
    }
}
