package com.yourtion.leetcode.daily.m10.d13;

import com.yourtion.leetcode.utils.ListNode;

/**
 * 24. 两两交换链表中的节点
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/swap-nodes-in-pairs/
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode node = head;
        while (node != null) {
            if (node.next != null) {
                int tmp = node.val;
                node.val = node.next.val;
                node.next.val = tmp;
                node = node.next;
            }
            node = node.next;
        }
        return head;
    }
}
