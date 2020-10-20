package com.yourtion.leetcode.daily.m10.d20;

import com.yourtion.leetcode.utils.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 143. 重排链表
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/reorder-list/
 */
public class Solution {
    public void reorderList(ListNode head) {
        if (head == null) {
            return;
        }
        List<ListNode> list = new ArrayList<>();
        ListNode node = head;
        while (node != null) {
            list.add(node);
            node = node.next;
        }
        int i = 0, j = list.size() - 1;
        while (i < j) {
            list.get(i).next = list.get(j);
            i++;
            if (i == j) {
                break;
            }
            list.get(j).next = list.get(i);
            j--;
        }
        list.get(i).next = null;
    }
}
