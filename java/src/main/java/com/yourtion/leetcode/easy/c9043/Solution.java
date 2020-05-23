package com.yourtion.leetcode.easy.c9043;

import com.yourtion.leetcode.utils.ListNode;

/**
 * 9043. 面试题06. 从尾到头打印链表
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/
 */
public class Solution {
    public int[] reversePrint(ListNode head) {
        int c = 0;
        ListNode n = head;
        while (n != null) {
            c += 1;
            n = n.next;
        }
        n = head;
        int[] ret = new int[c];
        while (n != null) {
            ret[--c] = n.val;
            n = n.next;
        }
        return ret;
    }
}
