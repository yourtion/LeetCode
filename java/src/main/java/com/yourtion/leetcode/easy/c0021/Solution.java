package com.yourtion.leetcode.easy.c0021;

import com.yourtion.leetcode.utils.ListNode;

/**
 * 21. 合并两个有序链表
 *
 * @author yourtion
 * @link https://leetcode-cn.com/problems/merge-two-sorted-lists
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return l1 == null ? l2 : l1;
        }
        ListNode cls = l1, clb = l2, ret = null, root = null;
        while (cls != null && clb != null) {
            ListNode cur;
            if (cls.val >= clb.val) {
                cur = clb;
                clb = clb.next;
            } else {
                cur = cls;
                cls = cls.next;
            }
            if (ret == null) {
                ret = new ListNode(cur.val);
                root = ret;
            } else {
                ret.next = new ListNode(cur.val);
                ret = ret.next;
            }
        }
        ret.next = clb == null ? cls : clb;
        return root;
    }
}