package com.yourtion.leetcode.easy.c1290;

import com.yourtion.leetcode.utils.ListNode;

/**
 * 1290. 二进制链表转整数
 *
 * @author Yourtion
 * @link https://leetcode-cn.com/problems/convert-binary-number-in-a-linked-list-to-integer/
 */
public class Solution {
    public int getDecimalValue(ListNode head) {
        int ret = 0;
        while (head != null) {
            ret = ret * 2 + head.val;
            head = head.next;
        }
        return ret;
    }
}
