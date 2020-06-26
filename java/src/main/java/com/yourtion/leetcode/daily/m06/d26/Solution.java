package com.yourtion.leetcode.daily.m06.d26;

import com.yourtion.leetcode.utils.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * 面试题 02.01. 移除重复节点
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/remove-duplicate-node-lcci/
 */
public class Solution {
    public ListNode removeDuplicateNodes(ListNode head) {
        if (head == null) {
            return null;
        }
        Set<Integer> set = new HashSet<>();
        ListNode pre = head;
        ListNode node = pre.next;
        while (node != null) {
            set.add(pre.val);
            if (!set.contains(node.val)) {
                pre.next = node;
                pre = node;
            } else {
                pre.next = null;
            }
            node = node.next;
        }
        return head;
    }
}
