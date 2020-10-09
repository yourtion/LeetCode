package com.yourtion.leetcode.daily.m10.d09;

import com.yourtion.leetcode.utils.ListNode;

/**
 * 141. 环形链表
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/linked-list-cycle/
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode cur = head;
        while (cur != null) {
            if (cur.val == Integer.MAX_VALUE) {
                return true;
            }
            cur.val = Integer.MAX_VALUE;
            cur = cur.next;
        }
        return false;
    }
}
