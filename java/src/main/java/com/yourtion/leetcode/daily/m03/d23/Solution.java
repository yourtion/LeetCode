package com.yourtion.leetcode.daily.m03.d23;

import com.yourtion.leetcode.utils.ListNode;

/**
 * 876. 链表的中间结点
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/middle-of-the-linked-list/
 */
public class Solution {
    public ListNode middleNode(ListNode head) {
        int count = 1;
        ListNode n = head;
        while (n != null) {
            count += 1;
            n = n.next;
        }
        count = count % 2 == 0 ? count / 2 - 1 : count / 2;
        n = head;
        for (int i = 0; i < count; i++) {
            n = n.next;
        }
        return n;
    }
}
