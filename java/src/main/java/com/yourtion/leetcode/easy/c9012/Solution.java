package com.yourtion.leetcode.easy.c9012;

import com.yourtion.leetcode.utils.ListNode;

/**
 * 9012. 面试题 02.06. 回文链表
 *
 * @author Yourtion
 */
public class Solution {
    private ListNode reverseLinked(ListNode head) {
        ListNode cur = head;
        ListNode prev = null;
        while (cur != null) {
            ListNode nextTemp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nextTemp;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        int len = 0;
        ListNode n = head;
        while (n != null) {
            len += 1;
            n = n.next;
        }
        int l = len % 2 == 0 ? len / 2 : (len / 2) + 1;
        ListNode n2 = head;
        while (l > 0) {
            l -= 1;
            if (l == 0) {
                ListNode n2n = n2;
                n2 = n2.next;
                n2n.next = null;
            } else {
                n2 = n2.next;
            }
        }
        ListNode n3 = reverseLinked(n2);
        n = head;
        l = len / 2;
        while (l > 0) {
            if (n == null || n3 == null || n.val != n3.val) {
                return false;
            }
            n = n.next;
            n3 = n3.next;
            l -= 1;
        }
        return true;
    }
}
