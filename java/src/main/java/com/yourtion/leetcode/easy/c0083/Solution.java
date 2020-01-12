package com.yourtion.leetcode.easy.c0083;

import com.yourtion.leetcode.utils.ListNode;

/**
 * 83. 删除排序链表中的重复元素
 *
 * @author yourtion
 * @link https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode node = head;
        ListNode curr = node;
        while (node != null) {
            if (node.val != curr.val) {
                curr.next = node;
                curr = node;
            }
            node = node.next;
        }
        if (curr.next != null && curr.next.val == curr.val) {
            curr.next = null;
        }
        return head;
    }
}
