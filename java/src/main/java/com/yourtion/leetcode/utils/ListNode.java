package com.yourtion.leetcode.utils;

/**
 * Definition for singly-linked list.
 *
 * @author yourtion
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ListNode: ");
        sb.append(val);
        ListNode n = next;
        while (n != null) {
            sb.append(" -> ");
            sb.append(n.val);
            n = n.next;
        }
        return sb.toString();
    }
}
