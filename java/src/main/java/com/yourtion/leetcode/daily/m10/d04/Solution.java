package com.yourtion.leetcode.daily.m10.d04;

import com.yourtion.leetcode.utils.ListNode;

/**
 * 2. 两数相加
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/add-two-numbers/
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ret = new ListNode(-1);
        ListNode head = ret;
        boolean carry = false;
        while (l1 != null || l2 != null || carry) {
            int r = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + (carry ? 1 : 0);
            carry = r >= 10;
            ret.next = new ListNode(r % 10);
            ret = ret.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        return head.next;
    }
}
